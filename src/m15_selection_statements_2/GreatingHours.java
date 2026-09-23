package m15_selection_statements_2;

public class GreatingHours {
    static void main() {
        int hour = 1;

        if ((hour>4)&&(hour<12)){
            System.out.println("Good Morning");
        }else if ((hour>11)&&(hour<18)){
            System.out.println("Good Afternoon");
        }else if ((hour>17)&&(hour<24)||((hour>=0)&&(hour<6))){
            System.out.println("Good evening");
        }else System.out.println("Invalid hour");

    }
}
