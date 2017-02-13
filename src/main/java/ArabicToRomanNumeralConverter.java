
public class ArabicToRomanNumeralConverter {

    private String[] ROMAN_ONES_DIGITS      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private String[] ROMAN_TENS_DIGITS      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private String[] ROMAN_HUNDREDS_DIGITS  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private String[] ROMAN_THOUSANDS_DIGITS = {"", "M", "MM", "MMM"};

    public String convertToRomanNumeral(int input) {
        String returnValue;

        int onesDigit = input % 10;
        returnValue = convertArabicOnesDigitToRomanNumeral(onesDigit);

        input -= input % 10;

        int tensDigit = input % 100 / 10;
        returnValue = convertArabicTensDigitToRomanNumeral(tensDigit) + returnValue;

        input -= input % 100;

        int hundredsDigit = input % 1000 / 100;
        returnValue = convertArabicHundredsDigitToRomanNumeral(hundredsDigit) + returnValue;

        input -= input % 1000;

        int thousandsDigit = input % 10000 / 1000;
        returnValue = convertArabicThousandsDigitToRomanNumeral(thousandsDigit) + returnValue;

        return returnValue;
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
}
