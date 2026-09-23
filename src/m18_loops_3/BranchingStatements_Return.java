package m18_loops_3;

public class BranchingStatements_Return {
    static void main() {
        for (int i = 1; i <6 ; i++) {
            if (i==3){
                //continue;// skips, jumps to the next iteration
                //break;//exits the loop
                return;//exits the method
            }
            System.out.println( i);
        }
    }
}
