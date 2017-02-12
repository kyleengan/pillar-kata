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
    public void shouldReturnIForInputOf1() {
        assertEquals("I", subject.convertToRomanNumeral(1));
    }

    @Test
    public void shouldReturnIIForInputOf2() {
        assertEquals("II", subject.convertToRomanNumeral(2));
    }
}
