package m21_methods_2;

public class ReturnKeyWordInVoidMethod {
    static void main() {
        eligibleToVote(130);
    }



    public static void eligibleToVote(int age){


        if (age<0 || age>120){
            System.err.println(" Invalid age "+ age);
            return;
        }


        if(age>=18){
            System.out.println(" Eligible");
        }else {
            System.out.println("Not eligible");
        }
    }
}
