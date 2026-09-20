package m21_methods_2;

public class ParametersArgumentsIntro {
    static void main() {
        eligibleToVote(35);

        int age=10;
        eligibleToVote(age);

    }
    public static void eligibleToVote(int age){

        if(age>=18){
            System.out.println(" You are eligible to vote");
        }else {
            System.out.println("Y0u are not eligible to vote");
        }

    }
}
