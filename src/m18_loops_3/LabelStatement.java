package m18_loops_3;

public class LabelStatement {
    static void main() {
        outer:
        for (int k = 1; k < 6; k++) {
            System.out.print(k+":");
            inner:
            for (char i = 'a'; i <'e' ; i++) {
                if (k==4){
                    break outer;
                }System.out.print( i+" ");
            }

            System.out.println();
        }


    }

}
