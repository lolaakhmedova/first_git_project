package m17_loops_2;

public class ForLoopsRules {
    static void main() {
     //2.multiple variables of same type can be given in initialization


        for (int i = 1,j=10; i <= 1; i++,j+=10) {
            System.out.println(i+"=="+j);
        }

        System.out.println("-----------------------");

        //3. re-assigning a variable in the for loop block is possible
        int x;
        for (x=0;x<5; x++){
            System.out.println(x);
        }

        //4. loop variable cannot be used outside the for loop body

        for (int i = 0; i <100 ; i+=10) {
            System.out.println(i);
        }







    }
}
