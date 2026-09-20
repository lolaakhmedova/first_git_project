package m18_loops_3;

public class DoWhileLoop {
    static void main() {
        int n =100;
        while(n < 0){
            System.out.println("while Loop: Hello World");
        }
        System.out.println("____________________");

        do{
            System.out.println("while Loop: Hello World");
        }while ( n<100);
    }
}
