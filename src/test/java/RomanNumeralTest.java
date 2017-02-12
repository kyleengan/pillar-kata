import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    @Test
    public void shouldReturnIForInputOf1() {
        RomanNumeral subject = new RomanNumeral();

        String result = subject.convertToRomanNumeral(1);

        assertEquals("I", result);
    }
}
