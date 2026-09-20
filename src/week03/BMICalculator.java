package week03;

public class BMICalculator {
    static void main() {
        double weight=83;
        double height=1.83;
        System.out.println(" The Body Mass Index (BMI)  is " + weight/(height * height));

        System.out.println("--------------------------------------");


        // Declare and assign a String containing a list of 3 food items
        String food = "Pizza, Burger, Fries";

        // Assign prices for each item
        double item1Price = 12.50;
        double item2Price = 8.99;
        double item3Price = 4.50;

        // Calculate the total price of all 3 items
        double total = item1Price + item2Price + item3Price;

        // Calculate tip amounts for 10%, 20%, and 30%
        double tip10 = total * 0.10;
        double tip20 = total * 0.20;
        double tip30 = total * 0.30;

        // Display the food items and the total price using concatenation
        System.out.println("Food items: " + food);
        System.out.println("Total Price: $" + total);

        // Display the tip amount options formatted to 2 decimal places
        System.out.printf("10%% Tip Option: $%.2f%n", tip10);
        System.out.printf("20%% Tip Option: $%.2f%n", tip20);
        System.out.printf("30%% Tip Option: $%.2f%n", tip30);
    }
}







