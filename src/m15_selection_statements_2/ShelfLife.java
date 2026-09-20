package m15_selection_statements_2;

public class ShelfLife {
    static void main() {
        int outsideTemperature = 100;
        int shelfLife = 7;

        if (outsideTemperature>90){
            shelfLife-=4;
        }
        System.out.println("shelfLife = "+shelfLife);
    }
}
