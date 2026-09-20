package m14_selection_statements_1;

public class WeeklyWage {
    static void main() {
        double wage =900;
        int hours =38;

        if(hours>40){
            wage*=1.5;
        }
        System.out.println("wage =" +wage);
    }
}
