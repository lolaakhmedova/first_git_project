package m18_loops_3;

public class evenOddNumbers {
    static void main() {
        for (int i = 1; i<21 ; i++) {
            if (i%2==0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        for (int i = 1; i<21 ; i++) {
            if (i%2!=0) {
                System.out.print(i + " ");
            }

        }
    }
}
