
public class ArabicToRomanNumeralConverter {

    private String[] ROMAN_ONES_DIGITS = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private String[] ROMAN_TENS_DIGITS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

    public String convertToRomanNumeral(int input) {
        String returnValue;

        int onesDigit = input % 10;
        returnValue = convertArabicOnesDigitToRomanNumeral(onesDigit);

        input -= input % 10;

        int tensDigit = input % 100 / 10;
        returnValue = convertArabicTensDigitToRomanNumeral(tensDigit) + returnValue;

        return returnValue;
    }


    public String convertArabicTensDigitToRomanNumeral(int tensDigit) {
        return ROMAN_TENS_DIGITS[tensDigit];
    }

    public String convertArabicOnesDigitToRomanNumeral(int onesDigit) {
        return ROMAN_ONES_DIGITS[onesDigit];
    }
}
