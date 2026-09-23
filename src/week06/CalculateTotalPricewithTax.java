package week06;

public class CalculateTotalPricewithTax {
    static void main() {
        System.out.println(calculateTotal(50));

    }
    public static double calculateTax(double price) {
        return price * 0.10;
    }

    public static double calculateTotal(double price) {
        double tax = calculateTax(price);
        return price + tax;
    }

}
