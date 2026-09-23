package week04;

public class IfElse {
    static void main() {
        boolean hungry = false;

        if (hungry) {
            System.out.println("lets get some snacks");
            System.out.println("Keep coding java");
        } else {
            System.out.println("Not hungry, lets keep coding java");
        }

        int score = 75;
        int passingScore = 50;

        if (score >= passingScore) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
