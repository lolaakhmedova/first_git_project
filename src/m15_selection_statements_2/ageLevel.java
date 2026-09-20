package m15_selection_statements_2;

public class ageLevel {
    static void main() {
        int age = 25;

        if ((age==3)|| (age==4)) {
            System.out.println("Preschool");
        } else if (age==5){
            System.out.println("kindergarten");
        }else if ((age>5)&& (age<11)){
            System.out.println("elementary school");
        }else if ((age>10)&& (age<14)){
            System.out.println("middle school");
        }else if ((age>13)&& (age<20)){
            System.out.println("high school");
        }else if (age>19) {
            System.out.println("college");
        }else if (age<3) {
            System.out.println("ineligible");
        }


    }
}
