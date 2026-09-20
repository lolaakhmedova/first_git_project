package m14_selection_statements_1;

public class Salary {
    static void main() {
        int salary= 40000;
        int yearsOnJob=1;

        if (salary>=40000) {

            if (yearsOnJob>2){
                System.out.println( "You are eligible for the loan.");
            } else {
                System.out.println(" You are not eligible for the loan");
            }

        }else {
            System.out.println(" You must earn at least 40000");
        }

    }
}
