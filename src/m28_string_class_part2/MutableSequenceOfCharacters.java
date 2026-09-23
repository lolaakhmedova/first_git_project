package m28_string_class_part2;

public class MutableSequenceOfCharacters {
    static void main() {
        StringBuilder stringBuilder = new StringBuilder("Java");
        System.out.println(stringBuilder);

        stringBuilder.append("Programming");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        String result= stringBuilder.toString();
        System.out.println(result);


        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.append("language");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);
        String result2 = stringBuffer.toString();
    }
}
