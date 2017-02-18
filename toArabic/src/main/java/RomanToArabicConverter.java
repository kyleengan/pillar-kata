public class RomanToArabicConverter {


    public int convert(String roman) {
        int returnVal = 0;

        if (roman.contains("IV")) {
            returnVal += 4;
            roman = roman.replaceAll("IV", "");
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
