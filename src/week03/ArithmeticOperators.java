package week03;

public class ArithmeticOperators {
    static void main() {
       int apple = 20;
       int banana = 30;
        int totalNumberOfFruits= apple + banana;
        System.out.println(apple + banana);



       double wallet = 105.9;
       double price = 21.6;
       System.out.println( wallet -price);
       double remaining = wallet - price;
        System.out.println("remaining is" +remaining);

        System.out.println("______________________________");

        int boxes =3;
        int itemsPerBox=5;
        int totalItems= boxes * itemsPerBox;
        System.out.println( totalItems);


        System.out.println("______________________________");
        System.out.println(10/3);
        System.out.println(10.0/3);

        System.out.println("______________________________");
        int minute=500;
        int tasks= 4;
        System.out.println("minutespertask is "+ minute/tasks);


        System.out.println("______________________________");

        System.out.println(10%2);
        System.out.println(23%2);
        int minutes =365;
        System.out.println(minutes%60);


        int chocolate = 25;
        int friends = 11;
        System.out.println("Each friend got " + (chocolate/friends));
        System.out.println("remainder is  " + (chocolate%friends));



    }
}
