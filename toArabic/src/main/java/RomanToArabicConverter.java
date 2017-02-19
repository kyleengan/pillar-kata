public class RomanToArabicConverter {

    public static final String IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX = "((IX|IV)|(V?I{0,3}))";
    public static final String IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX = "((XC|XL)|(L?X{0,3}))";
    public static final String IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX = "((CM|CD)|(D?C{0,3}))";
    public static final String IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX = "(M{0,3})";

    public static final String IS_ROMAN_NUMERAL_REGEX = "^"
            + IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX + "?"
            + IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX + "?"
            + IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX + "?"
            + IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX + "?$";

    public int convert(String roman) {
        int returnVal = 0;

        roman = roman.toUpperCase();

        returnVal += convertOnesDigit(roman);
        roman = truncateOnesDigit(roman);

        returnVal += convertTensDigit(roman);
        roman = truncateTensDigit(roman);

        returnVal += convertHundredsDigit(roman);
        roman = truncateHundredsDigit(roman);

        returnVal += convertThousandsDigit(roman);

        return returnVal;
    }

    private String truncateOnesDigit(String roman) {
        return roman.replaceAll("((IX)?(IV)?V?I*)", "");
    }

    private String truncateTensDigit(String roman) {
        return roman.replaceAll("((XC)?(XL)?L?X*)", "");
    }

    private String truncateHundredsDigit(String roman) {
        return roman.replaceAll("((CM)?(CD)?D?C*)", "");
    }

    protected int convertThousandsDigit(String romanThousandsDigit) {
        int returnVal = 0;

        for (int c = 0; c < romanThousandsDigit.length(); c++) {
            if (romanThousandsDigit.charAt(c) == 'M') {
                returnVal += 1000;
            }
        }

        return returnVal;
    }

    protected int convertHundredsDigit(String romanHundredsDigit) {
        int returnVal = 0;

        if (romanHundredsDigit.contains("CD")) {
            returnVal += 400;
            romanHundredsDigit = romanHundredsDigit.replaceAll("CD", "");

        } else if (romanHundredsDigit.contains("D")) {
            returnVal += 500;
            romanHundredsDigit = romanHundredsDigit.replaceAll("D", "");

        } else if (romanHundredsDigit.contains("CM")) {
            returnVal += 900;
            romanHundredsDigit = romanHundredsDigit.replaceAll("CM", "");

        }

        for (int c = 0; c < romanHundredsDigit.length(); c++) {
            if (romanHundredsDigit.charAt(c) == 'C') {
                returnVal += 100;
            }
        }

        return returnVal;
    }

    protected int convertTensDigit(String romanTensDigit) {
        int returnVal = 0;

        if (romanTensDigit.contains("XL")) {
            returnVal += 40;
            romanTensDigit = romanTensDigit.replaceAll("XL", "");

        } else if (romanTensDigit.contains("L")) {
            returnVal += 50;
            romanTensDigit = romanTensDigit.replaceAll("L", "");

        } else if (romanTensDigit.contains("XC")) {
            returnVal += 90;
            romanTensDigit = romanTensDigit.replaceAll("XC", "");

        }

        for (int c = 0; c < romanTensDigit.length(); c++) {
            if (romanTensDigit.charAt(c) == 'X') {
                returnVal += 10;
            }
        }

        return returnVal;
    }

    protected int convertOnesDigit(String romanOnesDigit) {
        int returnVal = 0;

        if (romanOnesDigit.contains("IV")) {
            returnVal += 4;
            romanOnesDigit = romanOnesDigit.replaceAll("IV", "");

        } else if (romanOnesDigit.contains("V")) {
            returnVal += 5;
            romanOnesDigit = romanOnesDigit.replaceAll("V", "");

        } else if (romanOnesDigit.contains("IX")) {
            returnVal += 9;
            romanOnesDigit = romanOnesDigit.replaceAll("IX", "");

        }

        for (int c = 0; c < romanOnesDigit.length(); c++) {
            if (romanOnesDigit.charAt(c) == 'I') {
                returnVal++;
            }
        }

        return returnVal;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No argument received.  Please run this utility again with a roman numeral between I and MMMCMXCIX.");

        } else if (args.length > 1) {
            System.out.println("Error: Too many arguments received.  Please run this utility again with a roman numeral between I and MMMCMXCIX.");

        } else if ( ! args[0].toUpperCase().matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX)) {
            System.out.println ("Error: '" + args[0] + "' is not a roman numeral between I and MMMCMXCIX.  Please try again.");

        } else {
            RomanToArabicConverter converter = new RomanToArabicConverter();
            System.out.println(converter.convert(args[0]));

        }
    }
}
