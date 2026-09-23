package m16_loops_1;

public class DifferentStartEnd {
    static void main() {

        for (int i = 5; i <=20 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-------------------------------");

        for (int i = 20; i >=10 ; i--) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("-------------------------------");

        for (int i = 10; i <=100 ; i+=10) {
            System.out.println(i+" ");
        }

        System.out.println();
        System.out.println("-------------------------------");

        for (int i = 50; i > 10 ; i-=4) {
            System.out.println(i);
        }
    }
}
