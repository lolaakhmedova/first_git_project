package week03;

public class LogicalOperators {
    static void main() {
        System.out.println(3>5);
        System.out.println(3>5 && 5>4);
        System.out.println(13>5 && 3>4);


        boolean knowsPassword = true;
        boolean hasFingerprint =true;
        System.out.println(knowsPassword && hasFingerprint);

        boolean isSunny = true;
        System.out.println(!isSunny);

    }
}
