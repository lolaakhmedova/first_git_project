package week05;

public class WhileLoop {
    static void main() {
        int counter = 1;

        while (counter <= 5) {
            System.out.println(counter);
            counter++;
        }

        int savings = 0;
        int days = 0;

        while (savings < 100) {
            savings += 10;
            days++;
            System.out.println("Day " + days + ": $" + savings);
        }
    }
}
