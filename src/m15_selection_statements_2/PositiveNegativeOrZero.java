package m15_selection_statements_2;

public class PositiveNegativeOrZero {
    static void main() {
        int num = 0;

        if (num< 0){
            System.out.println("negative");
        }else if (num>0){
            System.out.println("Positive");
        }else if (num==0){
            System.out.println("zero");
        }
    }
}
