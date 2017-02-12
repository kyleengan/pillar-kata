
public class RomanNumeral {


    public String convertToRomanNumeral(int input) {
        String returnValue = "";

        switch (input) {
            case 1:
                returnValue = "I";
                break;
            case 2:
                returnValue = "II";
                break;
        }

        return returnValue;
    }
}
