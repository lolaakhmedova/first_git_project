package week06;

public class Max {
    static void main() {
        System.out.println(max(1, 10));
    }


    public static int max(int n, int n2){
        if (n > n2) {
            return n;
        } else {
            return n2;
        }
    }
}
