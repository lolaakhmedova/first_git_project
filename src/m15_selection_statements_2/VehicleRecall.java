package m15_selection_statements_2;

public class VehicleRecall {
    static void main() {
        int modelYear = 2008;

        if (modelYear==2001||modelYear==2002){
            System.out.println("RECALL");

        }else if (modelYear>2003 && modelYear<2007){
            System.out.println("RECALL");

        }else if(modelYear>2014 && modelYear<2018){
            System.out.println("RECALL");

        }else System.out.println("NOT RECALL");


    }
}
