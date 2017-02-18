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
        assertEquals(1, subject.convert("I"));
        assertEquals(2, subject.convert("II"));
        assertEquals(3, subject.convert("III"));
    }

    @Test
    public void shouldConvertIVTo4() {
        assertEquals(4, subject.convert("IV"));
    }
}