package m18_loops_3;

public class BranchingStatementsIntro {
    static void main() {

        for (char i = 'A'; i <'E'; i++) {
            if(i=='C'){
                break;//exits the current loop
            }
            System.out.println(i);
        }

        for (int i = 1; i <10 ; i++) {
            if (i==5){
                continue;
            }
            System.out.print(i+" ");

        }
    }
}
