package m15_selection_statements_2;

public class SalesTrend {
    static void main() {
        int soldYesterday=100;
        int soldToday = 700;
        int salesTrend = 0;



        if (soldYesterday<soldToday) {
            salesTrend = 1;
        }else if(soldYesterday>soldToday){
            salesTrend=-1;
        }
        System.out.println(salesTrend);




    }
}
