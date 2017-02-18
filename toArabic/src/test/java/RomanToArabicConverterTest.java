import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class RomanToArabicConverterTest {

    private RomanToArabicConverter subject;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setup() {
        subject = new RomanToArabicConverter();
        System.setOut(new PrintStream(outContent));
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

    @Test
    public void shouldConvertCMTo900() {
        assertEquals(900, subject.convertHundredsDigit("CM"));
    }

    @Test
    public void shouldConvertThreeDigitNumbersAppropriately() {
        assertEquals(111, subject.convert("CXI"));
        assertEquals(222, subject.convert("CCXXII"));
        assertEquals(333, subject.convert("CCCXXXIII"));
        assertEquals(444, subject.convert("CDXLIV"));
        assertEquals(555, subject.convert("DLV"));
        assertEquals(666, subject.convert("DCLXVI"));
        assertEquals(777, subject.convert("DCCLXXVII"));
        assertEquals(888, subject.convert("DCCCLXXXVIII"));
        assertEquals(999, subject.convert("CMXCIX"));
    }

    @Test
    public void shouldConvertMsAppropriately() {
        assertEquals(1000, subject.convertThousandsDigit("M"));
        assertEquals(2000, subject.convertThousandsDigit("MM"));
        assertEquals(3000, subject.convertThousandsDigit("MMM"));
    }

    @Test
    public void shouldConvertFourDigitNumbersAppropriately() {
        assertEquals(1111, subject.convert("MCXI"));
        assertEquals(2222, subject.convert("MMCCXXII"));
        assertEquals(3333, subject.convert("MMMCCCXXXIII"));
    }

    @Test
    public void shouldBeCaseInsensitive() {
        assertEquals(3888, subject.convert("mMmdcCclxXxviIi"));
    }

    @Test
    public void whenGivenANonRomanNumeralShouldDisplayAnErrorToTheConsole() {
        String[] args = {"moohaha"};

        RomanToArabicConverter.main(args);

        assertEquals("Error: 'moohaha' is not a roman numeral between I and MMMCMXCIX.  Please try again." + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void whenGivenABadRomanNumeralShouldDisplayAnErrorToTheConsole() {
        String[] args = {"MMXXCCII"};

        RomanToArabicConverter.main(args);

        assertEquals("Error: 'MMXXCCII' is not a roman numeral between I and MMMCMXCIX.  Please try again." + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void whenGivenNoCommandLineArgumentWillDisplayAnErrorToTheConsole() {
        RomanToArabicConverter.main(new String[0]);

        assertEquals("Error: No argument received.  Please run this utility again with a roman numeral between I and MMMCMXCIX." + System.lineSeparator(),
                outContent.toString());
    }

}