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

    @Test
    public void shouldConvertXsAppropriately() {
        assertEquals(10, subject.convertTensDigit("X"));
        assertEquals(20, subject.convertTensDigit("XX"));
        assertEquals(30, subject.convertTensDigit("XXX"));
    }

    @Test
    public void shouldConvertXLTo40() {
        assertEquals(40, subject.convertTensDigit("XL"));
    }

    @Test
    public void shouldConvertXsAndLsAppropriately() {
        assertEquals(10, subject.convertTensDigit("X"));
        assertEquals(20, subject.convertTensDigit("XX"));
        assertEquals(30, subject.convertTensDigit("XXX"));
        assertEquals(40, subject.convertTensDigit("XL"));
        assertEquals(50, subject.convertTensDigit("L"));
        assertEquals(60, subject.convertTensDigit("LX"));
        assertEquals(70, subject.convertTensDigit("LXX"));
        assertEquals(80, subject.convertTensDigit("LXXX"));
    }

    @Test
    public void shouldConvertXCTo90() {
        assertEquals(90, subject.convertTensDigit("XC"));
    }

    @Test
    public void shouldConvertTwoDigitNumbersAppropriately() {
        assertEquals(11, subject.convert("XI"));
        assertEquals(22, subject.convert("XXII"));
        assertEquals(33, subject.convert("XXXIII"));
        assertEquals(44, subject.convert("XLIV"));
        assertEquals(55, subject.convert("LV"));
        assertEquals(66, subject.convert("LXVI"));
        assertEquals(77, subject.convert("LXXVII"));
        assertEquals(88, subject.convert("LXXXVIII"));
        assertEquals(99, subject.convert("XCIX"));
    }

    @Test
    public void shouldConvertCsAppropriately() {
        assertEquals(100, subject.convertHundredsDigit("C"));
        assertEquals(200, subject.convertHundredsDigit("CC"));
        assertEquals(300, subject.convertHundredsDigit("CCC"));
    }

    @Test
    public void shouldConvertCDTo400() {
        assertEquals(400, subject.convertHundredsDigit("CD"));
    }

    @Test
    public void shouldConvertCsAndDsAppropriately() {
        assertEquals(100, subject.convertHundredsDigit("C"));
        assertEquals(200, subject.convertHundredsDigit("CC"));
        assertEquals(300, subject.convertHundredsDigit("CCC"));
        assertEquals(400, subject.convertHundredsDigit("CD"));
        assertEquals(500, subject.convertHundredsDigit("D"));
        assertEquals(600, subject.convertHundredsDigit("DC"));
        assertEquals(700, subject.convertHundredsDigit("DCC"));
        assertEquals(800, subject.convertHundredsDigit("DCCC"));
    }
}