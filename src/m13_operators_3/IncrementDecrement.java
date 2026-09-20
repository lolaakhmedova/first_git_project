package m13_operators_3;

public class IncrementDecrement {
    static void main() {
        int x=5;
        int y = ++x;
        System.out.println("x="+x);
        System.out.println("y="+y);

        int a =10;
        int b=--a;
        System.out.println("a="+a);
        System.out.println("b="+b);

//post Increment and Decrement

        int m=5;
        int n=m++;
        System.out.println("m ="+ m);
        System.out.println("n ="+ n);

        int r = 10;
        int t = r--;
        System.out.println("r ="+ r);
        System.out.println("t ="+ t);



    }
}
