package m18_loops_3;

public class UtopianTree {
    static void main() {
        int treeSize = 0;
        int growth = 0;

        for (int year = 1; year <= 10; year++) {

            if (year < 4) {
                growth = 1;
            } else {
                growth = 2;
            }
            treeSize = treeSize + growth;

            System.out.println("year " + year + " - growth " + growth + " cm");
            System.out.println("tree size: " + treeSize + " cm");
        }

    }
}
