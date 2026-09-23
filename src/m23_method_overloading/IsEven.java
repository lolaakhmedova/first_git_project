package m23_method_overloading;

public class IsEven {
    static void main() {
        System.out.println(isEven(5));
    }


    public static boolean isEven(int n){
      return n % 2 == 0;


    }
}
