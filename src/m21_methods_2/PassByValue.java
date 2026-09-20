package m21_methods_2;

public class PassByValue {
    static void main() {
        int a =5;
        displayCube(a);

    }

    public static void displayCube(int num){
        System.out.println("The number is : " + num);
        num=num*num*num;
        System.out.println("Cube of this number is : "+ num);

    }
}
