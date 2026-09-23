package week06;

public class MethodsWithReturn {
    static void main() {
boolean result=hasFreeShipping(35.4);
        System.out.println(result);

        System.out.println(convertDollars(55, "EUR"));

    }

    public static int calculateAge(int birthYear){
        int resultAge=2026-birthYear;
        return resultAge;
    }

    public static boolean hasFreeShipping(double orderTotal) {

        if (orderTotal >= 50) {
            return true;
        } else {
           return  false;
        }

    }

    public static double convertDollars(double USDAmount, String currency) {
        return switch (currency) {
            case "EUR" -> USDAmount * 0.94;
            case "JPY" -> USDAmount * 149.51;
            case "TRY" -> USDAmount * 40.94;
            case "KRW" -> USDAmount * 1395.22;
            case "INR" -> USDAmount * 83.97;
            default -> 0;
        };
    }






}
