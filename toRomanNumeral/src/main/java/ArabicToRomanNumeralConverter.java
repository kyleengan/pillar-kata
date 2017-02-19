
public class ArabicToRomanNumeralConverter {

    private String[] ROMAN_ONES_DIGITS      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private String[] ROMAN_TENS_DIGITS      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private String[] ROMAN_HUNDREDS_DIGITS  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private String[] ROMAN_THOUSANDS_DIGITS = {"", "M", "MM", "MMM"};

    public void run(String convertMe) {
        if (convertMe == null) {
            convertMe = "";     // Let the number format handling catch this, avoid logic duplication
        }

        try {
            int numberToConvert = Integer.parseInt(convertMe.replaceAll(",", ""));
            System.out.println(convertToRomanNumeral(numberToConvert));

        } catch (NumberFormatException nfe) {
            System.out.println("Error: '" + convertMe + "' is not an integer.  Please try again with a number between 1 and 3,999.");

        } catch (IllegalArgumentException iae) {
            System.out.println("Error: This tool can only convert numbers up to 3,999.  Please try again with a number between 1 and 3,999.");

        }
    }

    protected String convertToRomanNumeral(int input) {
        String returnValue;

        returnValue = convertArabicOnesDigitToRomanNumeral(extractOnesDigit(input));
        input -= truncateOnesDigit(input);

        returnValue = convertArabicTensDigitToRomanNumeral(extractTensDigit(input)) + returnValue;
        input -= truncateTensDigit(input);

        returnValue = convertArabicHundredsDigitToRomanNumeral(extractHundredsDigit(input)) + returnValue;
        input -= truncateHundredsDigit(input);

        returnValue = convertArabicThousandsDigitToRomanNumeral(extractThousandsDigit(input)) + returnValue;

        return returnValue;
    }

    private int truncateOnesDigit(int input) {
        return input % 10;
    }

    private int truncateTensDigit(int input) {
        return input % 100;
    }

    private int truncateHundredsDigit(int input) {
        return input % 1000;
    }

    private int extractOnesDigit(int input) {
        return input % 10;
    }

    private int extractTensDigit(int input) {
        return input % 100 / 10;
    }

    private int extractHundredsDigit(int input) {
        return input % 1000 / 100;
    }

    private int extractThousandsDigit(int input) {
        return input % 10000 / 1000;
    }

    protected String convertArabicThousandsDigitToRomanNumeral(int thousandsDigit) {
        if (thousandsDigit >= 4) {
            throw new IllegalArgumentException ("This tool can only convert numbers up to 3,999.  Please try again.");
        }
        return ROMAN_THOUSANDS_DIGITS[thousandsDigit];
    }

    protected String convertArabicHundredsDigitToRomanNumeral(int hundredsDigit) {
        return ROMAN_HUNDREDS_DIGITS[hundredsDigit];
    }

    protected String convertArabicTensDigitToRomanNumeral(int tensDigit) {
        return ROMAN_TENS_DIGITS[tensDigit];
    }

    protected String convertArabicOnesDigitToRomanNumeral(int onesDigit) {
        return ROMAN_ONES_DIGITS[onesDigit];
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No argument received.  Please run this utility again with a number between 1 and 3,999");

        } else if (args.length > 1) {
            System.out.println("Error: Too many arguments received.  Please run this utility again with a number between 1 and 3,999");

        } else {
            ArabicToRomanNumeralConverter converter = new ArabicToRomanNumeralConverter();
            converter.run(args[0]);

        }
    }
}
