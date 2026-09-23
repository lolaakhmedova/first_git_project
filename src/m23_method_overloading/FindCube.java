package m23_method_overloading;

public class FindCube {
    static void main() {
     cube(5);
    }

    public static void cube(int n){
     int cube=n*n*n;
        System.out.println(n + " * " +n + " * " + n + " = " + cube);
    }
}
