package m15_selection_statements_2;

public class SwitchWithLambdaArrow {
    static void main() {

        int day=9;

    switch(day) {
        case 1-> {
                 System.out.println("Monday");
                 System.out.println("Day 1");
        }
        case 2 -> System.out.println("Tuesday");
        case 3-> System.out.println("Wednesday");
        case 4-> System.out.println("Thursday");
        case 5-> System.out.println("Friday");
        case 6,7-> System.out.println("Weekend");
        default -> System.out.println("Invalid");


        }
    }
}
