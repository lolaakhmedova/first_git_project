package week05;

public class NestedLoop {
    static void main() {
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 10; column++) {
                System.out.print((row * column) + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");

        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 10; column++) {
                System.out.println(row + "x" + column + "=" + (row * column));
            }
        }
    }
}
