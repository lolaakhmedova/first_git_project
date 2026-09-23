package m15_selection_statements_2;

public class Blackjack {
    static void main() {
        int house=45;
        int players=21;


            if (players > 21) {
               System.out.println("player bust");
            } else if (house==players && players<21) {
                System.out.println("its a tie");
            }else if(players==21){
                System.out.println("player win");
            }else if (house>players){
                System.out.println("player lose");
            }else if (players>house){
                System.out.println("player win");
            }

    }
}
