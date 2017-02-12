import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    private RomanNumeral subject;

    @Before
    public void setup() {
        subject = new RomanNumeral();
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
}
