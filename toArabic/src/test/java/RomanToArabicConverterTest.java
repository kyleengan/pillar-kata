import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;


public class RomanToArabicConverterTest {

    RomanToArabicConverter subject;

    @Before
    public void setup() {
        subject = new RomanToArabicConverter();
    }

    @Test
    public void shouldConvertIsApproriately() {
        assertEquals(1, subject.convertOnesDigit("I"));
        assertEquals(2, subject.convertOnesDigit("II"));
        assertEquals(3, subject.convertOnesDigit("III"));
    }

    @Test
    public void shouldConvertIVTo4() {
        assertEquals(4, subject.convertOnesDigit("IV"));
    }

    @Test
    public void shouldConvertIsAndVsAppropriately() {
        assertEquals(1, subject.convertOnesDigit("I"));
        assertEquals(2, subject.convertOnesDigit("II"));
        assertEquals(3, subject.convertOnesDigit("III"));
        assertEquals(4, subject.convertOnesDigit("IV"));
        assertEquals(5, subject.convertOnesDigit("V"));
        assertEquals(6, subject.convertOnesDigit("VI"));
        assertEquals(7, subject.convertOnesDigit("VII"));
        assertEquals(8, subject.convertOnesDigit("VIII"));
    }

    @Test
    public void shouldConvertIXTo9() {
        assertEquals(9, subject.convertOnesDigit("IX"));
    }
}