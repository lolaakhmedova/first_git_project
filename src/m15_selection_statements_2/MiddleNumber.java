package m15_selection_statements_2;

public class MiddleNumber {
    static void main() {
        int first = 5;
        int second = 30;
        int third = 50;

        if ((first > second) && (first < third)) {
            System.out.println("middle number = " + first);
        } else if ((second > first) && (second < third)) {
            System.out.println("middle number = " + second);

        }else if ((third>first)&&(third<second)) {
            System.out.println("middle number = " + third);
        }
    }
}
