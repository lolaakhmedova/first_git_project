package m28_string_class_part2;

public class IndexOfLastIndexOf {
    static void main() {


        String str = "Java programming language";
        int indexOfFirstA=str.indexOf("a");

        System.out.println(indexOfFirstA);

        int indexOfSecondA = str.indexOf("a p");
        System.out.println(indexOfSecondA);

        int indexOfThirdA = str.indexOf("a", 5);
        System.out.println(indexOfThirdA);

        int indexOfFourthA = str.indexOf("a", indexOfThirdA+1);
        System.out.println(indexOfFourthA);

        int indexOfLastA = str.lastIndexOf("a");
        System.out.println(indexOfLastA);
    }
}
