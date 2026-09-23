package m17_loops_2;

public class NestedLoopPractice {
    static void main() {
        for (int i = 1; i <5 ; i++) {
            System.out.println("outer loop iteration " +i);
            for (int j = 1; j <4 ; j++) {
                System.out.println(" i = " + i + "|" + "j = "+ j);
            }
            System.out.println();
        }
    }
}
