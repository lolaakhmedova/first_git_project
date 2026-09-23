package m23_method_overloading;

public class Sign {
    static void main() {
        sign(-4);
    }
    public static void sign(int n){
        if (n>0){
            System.out.println("positive");
        }else if (n<0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }
    }


}
