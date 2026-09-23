package m27_string_class_part1;

import java.util.Locale;

public class ConcatLowerCaseUpperCase {
    static void main() {

        String str = "Cydeo";
        str = str.concat("School");

        System.out.println(str);// Cydeo School

        String lowerCaseStr = str.toLowerCase();
        System.out.println(lowerCaseStr);

        String upperCaseStr = str.toUpperCase();
        System.out.println(upperCaseStr);


    }
}
