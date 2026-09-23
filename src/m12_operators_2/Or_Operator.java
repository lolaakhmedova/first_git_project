package m12_operators_2;

public class Or_Operator {
    static void main() {
        int x =50;
        System.out.println((x<100) | (x>0));
        //                  true | true==>true

        System.out.println((x<100) || (x>0));
        //                  true || ...==>true

        System.out.println((x>100) || (x<0));
        //                  false || false ==>false

        System.out.println((x>100) | (x<0));
        //                  false | false ==>false
    }

}
