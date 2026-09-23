package m23_method_overloading;

public class MethodOveloadingIntro {
    static void main() {
       displayValues(2.5);
    }

    public static void displayValues(int a){
        System.out.println("First method");
    }

    public static void displayValues(double a){
        System.out.println("Second method");
    }

    public static void displayValues(int a, double b){
        System.out.println(" Third method");
    }

}
