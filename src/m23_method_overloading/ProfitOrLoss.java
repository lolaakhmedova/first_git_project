package m23_method_overloading;

public class ProfitOrLoss {
    static void main() {
        System.out.println(profit(1, 10));

    }

    public static String profit(int buyPrice, int sellPrice){
        if (sellPrice>buyPrice){
            return "profit";
        }else if (sellPrice<buyPrice) {
        return "loss";
        }else return "no loss";
    }

}
