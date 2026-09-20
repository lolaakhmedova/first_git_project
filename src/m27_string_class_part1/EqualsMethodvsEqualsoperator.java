package m27_string_class_part1;

public class EqualsMethodvsEqualsoperator {
    static void main() {

        String str1 ="Java";
        String str2 = "Java";

        System.out.println(str1==str2);// same object
        System.out.println( str1.equals(str2)); //have the same characters in the same order

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3==str4);// same object?
        System.out.println(str3.equals(str4));
        System.out.println(str1.equals(str4));



    }
}
