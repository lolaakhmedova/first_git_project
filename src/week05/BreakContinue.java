package week05;

public class BreakContinue {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                System.out.println("Number 8 is found!");
                break;
            }
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;//skips the iteration
            }

            System.out.println(i);
        }

        for (int day = 1; day <= 7; day++) {
            if (day == 6) {
                System.out.println("Weekend is off");
                return;//Exit main method
            }

            System.out.println("Work day " + day);
        }
    }
}
