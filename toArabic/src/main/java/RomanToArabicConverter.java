public class RomanToArabicConverter {



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

    public int convertThousandsDigit(String romanThousandsDigit) {
        int returnVal = 0;

        for (int c = 0; c < romanThousandsDigit.length(); c++) {
            if (romanThousandsDigit.charAt(c) == 'M') {
                returnVal += 1000;
            }
        }

        return returnVal;
    }

    public int convertHundredsDigit(String romanHundredsDigit) {
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

    public int convertTensDigit(String romanTensDigit) {
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

    public int convertOnesDigit(String romanOnesDigit) {
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

        } else if ( ! args[0].matches("^(M*)?((CM)?(CD)?D?C*)?((XC)?(XL)?L?X*)?((IX)?(IV)?V?I*)?$")) {
            System.out.println ("Error: '" + args[0] + "' is not a roman numeral between I and MMMCMXCIX.  Please try again.");

        }
    }
}
