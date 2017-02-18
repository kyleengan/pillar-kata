public class RomanToArabicConverter {


    public int convert(String roman) {
        int returnVal = 0;

        if (roman.contains("IV")) {
            returnVal += 4;
            roman = roman.replaceAll("IV", "");
        } else if (roman.contains("V")) {
            returnVal += 5;
            roman = roman.replaceAll("V", "");
        } else if (roman.contains("IX")) {
            returnVal += 9;
            roman = roman.replaceAll("IX", "");
        }

        for (int c = 0; c < roman.length(); c++) {
            if (roman.charAt(c) == 'I') {
                returnVal++;
            }
        }

        return returnVal;
    }

    public static void main(String[] args) {
        RomanToArabicConverter converter = new RomanToArabicConverter();
        System.out.println(converter.convert(args[0]));
    }
}
