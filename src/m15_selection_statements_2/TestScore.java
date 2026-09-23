package m15_selection_statements_2;

public class TestScore {
    static void main() {
        int testScore=40;

        if (testScore>=90){
            System.out.println("A");
        }else if ((testScore>79)&& (testScore<90)){
            System.out.println("B");
        }else if ((testScore>69)&& (testScore<80)){
            System.out.println("C");
        }else if ((testScore>59)&& (testScore<70)) {
            System.out.println("D");
        }else if (testScore<60){
            System.out.println("F");
        }
    }
}
