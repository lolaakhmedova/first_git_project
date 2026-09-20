package m22_methods_3;

public class VoidMethodPractice {
    static void main() {
       displayGrade(0);
    }
    public static void displayGrade(int score){
        if (score==0 || score>100){
            System.out.println("Invalid score");
            return;
        }


        if( score >=90){
            System.out.println(" Excellent, You made an A");
        }else if (score <90 & score>80){
            System.out.println(" Your grade is B");
        }else {
            System.out.println("Not a good job");
        }
    }
}
