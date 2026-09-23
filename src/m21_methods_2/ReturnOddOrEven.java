package m21_methods_2;

public class ReturnOddOrEven {
    static void main() {

        String s1=OddOrEven(45);
        System.out.println(s1);


    }

    public static String OddOrEven(int number){
       if(number%2==0){
           return "Even";
       }else {
          return "Odd";
       }
    }
}
