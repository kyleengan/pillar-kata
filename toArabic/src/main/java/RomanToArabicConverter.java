public class RomanToArabicConverter {


    public int convert(String roman) {
        int returnVal = 0;
        if (roman.equals("I")) {
            returnVal = 1;
        } else if (roman.equals("II")) {
            returnVal = 2;
        }
        return returnVal;
    }

    public static void main(String[] args) {
        RomanToArabicConverter converter = new RomanToArabicConverter();
        System.out.println(converter.convert(args[0]));
    }
}
