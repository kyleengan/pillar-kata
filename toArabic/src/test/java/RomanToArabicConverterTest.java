import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class RomanToArabicConverterTest {

    RomanToArabicConverter subject;

    @Before
    public void setup() {
        subject = new RomanToArabicConverter();
    }

    @Test
    public void shouldConvertITo1() {
        assertEquals(1, subject.convert("I"));
    }

    @Test
    public void shouldConvertIIto2() {
        assertEquals(2, subject.convert("II"));
    }
}