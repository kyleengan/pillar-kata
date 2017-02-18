public class RomanToArabicConverter {



    public int convert(String roman) {
        int returnVal = 0;

        returnVal += convertOnesDigit(roman);

        return returnVal;
    }

    public int convertTensDigit(String romanTensDigit) {
        int returnVal = 0;

        if (romanTensDigit.contains("XL")) {
            returnVal += 40;
            romanTensDigit = romanTensDigit.replaceAll("XL", "");
        } else if (romanTensDigit.contains("L")) {
            returnVal += 50;
            romanTensDigit = romanTensDigit.replaceAll("L", "");
        }

        for (int c = 0; c < romanTensDigit.length(); c++) {
            if (romanTensDigit.charAt(c) == 'X') {
                returnVal += 10;
            }
        }

        return returnVal;
    }

    public int convertOnesDigit(String romanOnesDigit) {
        int returnVal = 0;

        if (romanOnesDigit.contains("IV")) {
            returnVal += 4;
            romanOnesDigit = romanOnesDigit.replaceAll("IV", "");
        } else if (romanOnesDigit.contains("V")) {
            returnVal += 5;
            romanOnesDigit = romanOnesDigit.replaceAll("V", "");
        } else if (romanOnesDigit.contains("IX")) {
            returnVal += 9;
            romanOnesDigit = romanOnesDigit.replaceAll("IX", "");
        }

        for (int c = 0; c < romanOnesDigit.length(); c++) {
            if (romanOnesDigit.charAt(c) == 'I') {
                returnVal++;
            }
        }

        return returnVal;
    }

    public static void main(String[] args) {
        /// UNTESTED TEMPORARY CODE
        RomanToArabicConverter converter = new RomanToArabicConverter();
        System.out.println(converter.convert(args[0]));
        /// UNTESTED TEMPORARY CODE
    }
}
