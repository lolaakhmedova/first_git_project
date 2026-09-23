package m18_loops_3;

public class Factorial {
    static void main() {
        int n = 10;
        int factorial = n;

        for (int i = n - 1; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
