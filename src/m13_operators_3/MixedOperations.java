package m13_operators_3;

public class MixedOperations {
    static void main() {
        byte num1=100;
        short num2=20;

        short num3= (short) (num1+num2);
        System.out.println(num3);


        int a = 100;
        long b =200;
        long c = a+b;
        System.out.println(c);

        short x=2;
        float y=2.5f;
        float z=x*y;
        System.out.println(z);



    }
}
