package m28_string_class_part2;

public class SubString {
    static void main() {
        String str ="Wooden Spoon";

        String firstWord=str.substring(0,str.indexOf(" "));
        System.out.println(firstWord);

        String secondWord = str.substring(str.indexOf(" ")+1);
        System.out.println(secondWord);
    }
}
