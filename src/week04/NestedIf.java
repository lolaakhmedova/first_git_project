package week04;

public class NestedIf {
    static void main() {
        boolean isPrimeMember = false;
        double orderAmount = 50.0;
        String shipping;

        if (isPrimeMember) {
            if (orderAmount >= 35.0) {
                shipping = "Free same day shipping";
            } else {
                shipping = "Free prime shipping";
            }
        } else {
            if (orderAmount >= 35.0) {
                shipping = "Free regular shipping";
            } else {
                shipping = "$5.99 shipping fee";
            }
        }

        System.out.println("Order amount: $" + orderAmount);
        System.out.println("Shipping: " + shipping);
    }
}
