package week04;

public class MultibranchIf {
    static void main() {
        int rank = 7;

        if (rank == 1) {
            System.out.println("Gold");
        } else if (rank == 2) {
            System.out.println("Silver");
        } else if (rank == 3) {
            System.out.println("Bronze");
        } else {
            System.out.println("No medal, try again next time");
        }
        System.out.println("---------------------------");

        int hour = 23;

        if (hour >= 6 && hour <= 10) {
            System.out.println("Breakfast time");
        } else if (hour >= 11 && hour <= 14) {
            System.out.println("Lunch time");
        } else if (hour >= 15 && hour <= 17) {
            System.out.println("Snack time");
        } else if (hour >= 18 && hour <= 21) {
            System.out.println("Dinner time");
        } else {
            System.out.println("Kitchen is closed");
        }
    }
}
