package m21_methods_2;

public class ReturnMethods {
    static void main() {
        int result= addNumbers(30,25);
        System.out.println(result);

    }
    public static int addNumbers(int num1, int num2){
       int num3= num1 + num2;
       return num3;
    }
}
