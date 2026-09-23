package m28_string_class_part2;

public class ReplaceTrim {
    static void main() {

        String str = "Apple Apple Apple";

        String str2= str.replace("Apple", "Cherry");
        System.out.println(str2);

        String str3 = str.replaceFirst("Apple", "Cherry");
        System.out.println(str3);


        String s = "    Cydeo School   ";
        s = s.trim();

        System.out.println(s);

    }
}
