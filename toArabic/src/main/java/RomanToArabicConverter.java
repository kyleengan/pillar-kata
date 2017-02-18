public class RomanToArabicConverter {


    public int convert(String roman) {
        int returnVal = 0;
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
