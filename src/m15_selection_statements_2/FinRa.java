package m15_selection_statements_2;

public class FinRa {
    static void main() {
        int number = 93;

        if ((number % 5==0) && (number % 3==0)) {
            System.out.println("FINRA");
        }else if (number%3==0){
            System.out.println("Fin");
        } else if (number % 5==0) {
            System.out.println("Ra");
        }else {
            System.out.println(number);
        }
    }
}
