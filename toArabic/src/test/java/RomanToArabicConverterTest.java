import org.junit.After;
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

    @After
    public void cleanup() {
        System.setOut(null);
    }

    @Test
    public void IS_ROMAN_ONES_DIGIT_REGEX_shouldMatchAllValuesOfOnesDigit() {
        assertTrue("I".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertTrue("II".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertTrue("III".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertTrue("IV".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertTrue("V".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertTrue("VI".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertTrue("VII".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertTrue("VIII".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertTrue("IX".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
    }

    @Test
    public void IS_ROMAN_ONES_DIGIT_REGEX_shouldNotMatchNonOnesDigitNumerals() {
        assertFalse("X".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertFalse("XL".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertFalse("L".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertFalse("XC".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertFalse("C".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertFalse("CD".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertFalse("D".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertFalse("CM".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
        assertFalse("M".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_ONES_DIGIT_REGEX));
    }

    @Test
    public void IS_ROMAN_TENS_DIGIT_REGEX_shouldMatchAllValuesOfTensDigit() {
        assertTrue("X".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertTrue("XX".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertTrue("XXX".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertTrue("XL".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertTrue("L".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertTrue("LX".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertTrue("LXX".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertTrue("LXXX".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertTrue("XC".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
    }

    @Test
    public void IS_ROMAN_TENS_DIGIT_REGEX_shouldNotMatchNonTensDigitNumerals() {
        assertFalse("I".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertFalse("IV".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertFalse("V".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertFalse("IX".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertFalse("C".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertFalse("CD".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertFalse("D".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertFalse("CM".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
        assertFalse("M".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_TENS_DIGIT_REGEX));
    }

    @Test
    public void IS_ROMAN_HUNDREDS_DIGIT_REGEX_shouldMatchAllValuesOfHundredsDigit() {
        assertTrue("C".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertTrue("CC".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertTrue("CCC".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertTrue("CD".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertTrue("D".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertTrue("DC".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertTrue("DCC".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertTrue("DCCC".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertTrue("CM".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
    }

    @Test
    public void IS_ROMAN_HUNDREDS_DIGIT_REGEX_shouldNotMatchNonHundredsDigitNumerals() {
        assertFalse("X".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertFalse("XL".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertFalse("L".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertFalse("XC".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertFalse("I".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertFalse("IV".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertFalse("V".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertFalse("IX".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
        assertFalse("M".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_HUNDREDS_DIGIT_REGEX));
    }

    @Test
    public void IS_ROMAN_THOUSANDS_DIGIT_REGEX_shouldMatchAllValuesOfThousandsDigit() {
        assertTrue("M".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertTrue("MM".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertTrue("MMM".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
    }

    @Test
    public void IS_ROMAN_THOUSANDS_DIGIT_REGEX_shouldNotMatchNonThousandsDigitNumerals() {
        assertFalse("I".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertFalse("IV".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertFalse("V".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertFalse("IX".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertFalse("X".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertFalse("XL".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertFalse("L".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertFalse("XC".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertFalse("C".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertFalse("CD".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertFalse("D".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
        assertFalse("CM".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_THOUSANDS_DIGIT_REGEX));
    }

    @Test
    public void IS_ROMAN_NUMERAL_REGEX_shouldMatchSelectedValidRomanNumerals() {
        assertTrue("MCXI".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertTrue("MMCCXXII".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertTrue("MMMCCCXXXIII".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertTrue("MCDXLIV".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertTrue("MMDLV".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertTrue("MMMDCLXVI".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertTrue("MDCCLXXVII".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertTrue("MMDCCCLXXXVIII".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertTrue("MMMCMXCIX".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
    }

    @Test
    public void IS_ROMAN_NUMERAL_REGEX_shouldNotMatchSelectedMalformedRomanNumerals() {
        assertFalse("MXXCI".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertFalse("CMMCXXII".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertFalse("CMCMXXXIII".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertFalse("MCDXLIVIV".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertFalse("MMDLVV".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertFalse("MMMDCXLXVI".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertFalse("MDMCCLXXVII".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertFalse("IMDCCCLXXXVIII".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
        assertFalse("MMMMCMXCIX".matches(RomanToArabicConverter.IS_ROMAN_NUMERAL_REGEX));
    }

    @Test
    public void givenIs_shouldReturnCorrectValues() {
        assertEquals(1, subject.convertOnesDigit("I"));
        assertEquals(2, subject.convertOnesDigit("II"));
        assertEquals(3, subject.convertOnesDigit("III"));
    }

    @Test
    public void givenIV_shouldReturn4() {
        assertEquals(4, subject.convertOnesDigit("IV"));
    }

    @Test
    public void givenMixesOfIsAndVs_shouldReturnCorrectValues() {
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
    public void givenIX_shouldReturn9() {
        assertEquals(9, subject.convertOnesDigit("IX"));
    }

    @Test
    public void givenXs_shouldReturnCorrectValues() {
        assertEquals(10, subject.convertTensDigit("X"));
        assertEquals(20, subject.convertTensDigit("XX"));
        assertEquals(30, subject.convertTensDigit("XXX"));
    }

    @Test
    public void givenXL_shouldReturn40() {
        assertEquals(40, subject.convertTensDigit("XL"));
    }

    @Test
    public void givenMixesOfXsAndLs_shouldReturnCorrectValues() {
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
    public void givenXC_shouldReturn90() {
        assertEquals(90, subject.convertTensDigit("XC"));
    }

    @Test
    public void givenSelectedTwoDigitNumbers_shouldReturnCorrectValues() {
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
    public void givenCs_shouldReturnCorrectValues() {
        assertEquals(100, subject.convertHundredsDigit("C"));
        assertEquals(200, subject.convertHundredsDigit("CC"));
        assertEquals(300, subject.convertHundredsDigit("CCC"));
    }

    @Test
    public void givenCD_shouldReturn400() {
        assertEquals(400, subject.convertHundredsDigit("CD"));
    }

    @Test
    public void givenMixesOfCsAndDs_shouldReturnCorrectValues() {
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
    public void givenCM_shouldReturn900() {
        assertEquals(900, subject.convertHundredsDigit("CM"));
    }

    @Test
    public void givenSelectedThreeDigitNumbers_shouldReturnCorrectValues() {
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
    public void givenMs_shouldReturnCorrectValues() {
        assertEquals(1000, subject.convertThousandsDigit("M"));
        assertEquals(2000, subject.convertThousandsDigit("MM"));
        assertEquals(3000, subject.convertThousandsDigit("MMM"));
    }

    @Test
    public void givenSelectedFourDigitNumbers_shouldReturnCorrectValues() {
        assertEquals(1111, subject.convert("MCXI"));
        assertEquals(2222, subject.convert("MMCCXXII"));
        assertEquals(3333, subject.convert("MMMCCCXXXIII"));
    }

    @Test
    public void givenMixedCaseInput_shouldReturnCorrectValue() {
        assertEquals(3888, subject.convert("mMmdcCclxXxviIi"));
    }

    @Test
    public void givenANonRomanNumeral_shouldDisplayAnErrorToTheConsole() {
        String[] args = {"moohaha"};

        RomanToArabicConverter.main(args);

        assertEquals("Error: 'moohaha' is not a roman numeral between I and MMMCMXCIX.  Please try again." + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void givenAnInvalidRomanNumeral_shouldDisplayAnErrorToTheConsole() {
        String[] args = {"MMXXCCII"};

        RomanToArabicConverter.main(args);

        assertEquals("Error: 'MMXXCCII' is not a roman numeral between I and MMMCMXCIX.  Please try again." + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void givenNoCommandLineArgument_shouldDisplayAnErrorToTheConsole() {
        RomanToArabicConverter.main(new String[0]);

        assertEquals("Error: No argument received.  Please run this utility again with a roman numeral between I and MMMCMXCIX." + System.lineSeparator(),
                outContent.toString());
    }


    @Test
    public void whenRunWithMoreThanOneArgument_shouldOutputAnErrorToConsole() {
        RomanToArabicConverter.main(new String[2]);

        assertEquals("Error: Too many arguments received.  Please run this utility again with a roman numeral between I and MMMCMXCIX." + System.lineSeparator(),
                outContent.toString());
    }

    @Test
    public void whenRunWithARomanNumeralBetween1And3999_shouldOutputResultToConsole() {
        String[] args = {"MMCCXXII"};

        RomanToArabicConverter.main(args);

        assertEquals("2222" + System.lineSeparator(), outContent.toString());
    }

}