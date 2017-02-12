
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
            case 3:
                returnValue = "III";
                break;
            case 4:
                returnValue = "IV";
                break;
            case 5:
                returnValue = "V";
                break;
            case 6:
                returnValue = "VI";
                break;
            case 7:
                returnValue = "VII";
                break;
            case 8:
                returnValue = "VIII";
                break;
            case 9:
                returnValue = "IX";
                break;
            case 0:
                returnValue = "";
                break;
        }

        return returnValue;
    }
}
