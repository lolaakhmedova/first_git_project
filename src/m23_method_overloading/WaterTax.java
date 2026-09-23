package m23_method_overloading;

public class WaterTax {
    static void main() {
        System.out.println(waterTax(55));

    }
    public static double waterTax(double units){
        double bill;

        if (units <= 50) {
            bill = units * 0.60;
        } else if (units <= 100) {
            bill = units * 0.90;
        } else if (units <= 150) {
            bill = units * 0.90 + 50;
        } else {
            bill = units * 0.90 + 100;
        }

        return bill;

    }


}
