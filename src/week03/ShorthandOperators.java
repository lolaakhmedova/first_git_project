package week03;

public class ShorthandOperators {
    static void main() {
        int points = 120;
        int bonusPoints =50;
        points += bonusPoints;
        System.out.println(points);

        points=70;
        points-=50;
        System.out.println(points);


        int totalPoints=100;
        totalPoints*=3;
        System.out.println(totalPoints);

        System.out.println("---------------------------------");


        int totalPages=500;
        totalPages /=30;
        System.out.println(totalPages);

        String str = "Friends";
        str += "Hello";
        System.out.println(str);

        System.out.println("---------------------------------");

        char letter='A';
        letter ++;
        System.out.println(letter);




    }
}
