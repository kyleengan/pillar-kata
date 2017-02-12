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
        assertEquals("", subject.convertToRomanNumeral(0));
        assertEquals("I", subject.convertToRomanNumeral(1));
        assertEquals("II", subject.convertToRomanNumeral(2));
        assertEquals("III", subject.convertToRomanNumeral(3));
        assertEquals("IV", subject.convertToRomanNumeral(4));
        assertEquals("V", subject.convertToRomanNumeral(5));
        assertEquals("VI", subject.convertToRomanNumeral(6));
        assertEquals("VII", subject.convertToRomanNumeral(7));
        assertEquals("VIII", subject.convertToRomanNumeral(8));
        assertEquals("IX", subject.convertToRomanNumeral(9));
    }

    @Test
    public void shouldReturnCorrectValueForTensDigit() {
        assertEquals("", subject.convertToRomanNumeral(0));
        assertEquals("X", subject.convertToRomanNumeral(10));
        assertEquals("XX", subject.convertToRomanNumeral(20));
        assertEquals("XXX", subject.convertToRomanNumeral(30));
        assertEquals("XL", subject.convertToRomanNumeral(40));
        assertEquals("L", subject.convertToRomanNumeral(50));
        assertEquals("LX", subject.convertToRomanNumeral(60));
        assertEquals("LXX", subject.convertToRomanNumeral(70));
        assertEquals("LXXX", subject.convertToRomanNumeral(80));
        assertEquals("XC", subject.convertToRomanNumeral(90));
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
}
