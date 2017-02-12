import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArabicToRomanNumeralConverterTest {

    private ArabicToRomanNumeralConverter subject;

    @Before
    public void setup() {
        subject = new ArabicToRomanNumeralConverter();
    }

    @Test
    public void shouldReturnCorrectValueForOnesDigit() {
        assertEquals("", subject.convertArabicOnesDigitToRomanNumeral(0));
        assertEquals("I", subject.convertArabicOnesDigitToRomanNumeral(1));
        assertEquals("II", subject.convertArabicOnesDigitToRomanNumeral(2));
        assertEquals("III", subject.convertArabicOnesDigitToRomanNumeral(3));
        assertEquals("IV", subject.convertArabicOnesDigitToRomanNumeral(4));
        assertEquals("V", subject.convertArabicOnesDigitToRomanNumeral(5));
        assertEquals("VI", subject.convertArabicOnesDigitToRomanNumeral(6));
        assertEquals("VII", subject.convertArabicOnesDigitToRomanNumeral(7));
        assertEquals("VIII", subject.convertArabicOnesDigitToRomanNumeral(8));
        assertEquals("IX", subject.convertArabicOnesDigitToRomanNumeral(9));
    }

    @Test
    public void shouldReturnCorrectValueForTensDigit() {
        assertEquals("", subject.convertArabicTensDigitToRomanNumeral(0));
        assertEquals("X", subject.convertArabicTensDigitToRomanNumeral(1));
        assertEquals("XX", subject.convertArabicTensDigitToRomanNumeral(2));
        assertEquals("XXX", subject.convertArabicTensDigitToRomanNumeral(3));
        assertEquals("XL", subject.convertArabicTensDigitToRomanNumeral(4));
        assertEquals("L", subject.convertArabicTensDigitToRomanNumeral(5));
        assertEquals("LX", subject.convertArabicTensDigitToRomanNumeral(6));
        assertEquals("LXX", subject.convertArabicTensDigitToRomanNumeral(7));
        assertEquals("LXXX", subject.convertArabicTensDigitToRomanNumeral(8));
        assertEquals("XC", subject.convertArabicTensDigitToRomanNumeral(9));
    }

    @Test
    public void shouldReturnCorrectValuesForHundredsDigit() {
        assertEquals("", subject.convertArabicHundredsDigitToRomanNumeral(0));
        assertEquals("C", subject.convertArabicHundredsDigitToRomanNumeral(1));
        assertEquals("CC", subject.convertArabicHundredsDigitToRomanNumeral(2));
        assertEquals("CCC", subject.convertArabicHundredsDigitToRomanNumeral(3));
        assertEquals("CD", subject.convertArabicHundredsDigitToRomanNumeral(4));
        assertEquals("D", subject.convertArabicHundredsDigitToRomanNumeral(5));
        assertEquals("DC", subject.convertArabicHundredsDigitToRomanNumeral(6));
        assertEquals("DCC", subject.convertArabicHundredsDigitToRomanNumeral(7));
        assertEquals("DCCC", subject.convertArabicHundredsDigitToRomanNumeral(8));
        assertEquals("CM", subject.convertArabicHundredsDigitToRomanNumeral(9));
    }

    @Test
    public void shouldReturnCorrectValuesForSelectedTwoDigitNumbers() {
        assertEquals("XI", subject.convertToRomanNumeral(11));
        assertEquals("XXII", subject.convertToRomanNumeral(22));
        assertEquals("XXXIII", subject.convertToRomanNumeral(33));
        assertEquals("XLIV", subject.convertToRomanNumeral(44));
        assertEquals("LV", subject.convertToRomanNumeral(55));
        assertEquals("LXVI", subject.convertToRomanNumeral(66));
        assertEquals("LXXVII", subject.convertToRomanNumeral(77));
        assertEquals("LXXXVIII", subject.convertToRomanNumeral(88));
        assertEquals("XCIX", subject.convertToRomanNumeral(99));
    }

    @Test
    public void shouldReturnCorrectValuesForSelectedThreeDigitNumbers() {
        assertEquals("CXI", subject.convertToRomanNumeral(111));
        assertEquals("CCXXII", subject.convertToRomanNumeral(222));
        assertEquals("CCCXXXIII", subject.convertToRomanNumeral(333));
        assertEquals("CDXLIV", subject.convertToRomanNumeral(444));
        assertEquals("DLV", subject.convertToRomanNumeral(555));
        assertEquals("DCLXVI", subject.convertToRomanNumeral(666));
        assertEquals("DCCLXXVII", subject.convertToRomanNumeral(777));
        assertEquals("DCCCLXXXVIII", subject.convertToRomanNumeral(888));
        assertEquals("CMXCIX", subject.convertToRomanNumeral(999));
    }
}
