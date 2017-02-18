import org.junit.Test;

import static org.junit.Assert.*;


public class RomanToArabicConverterTest {

    @Test
    public void shouldConvertITo1() {
        RomanToArabicConverter subject = new RomanToArabicConverter();

        assertEquals(1, subject.convert("I"));
    }
}