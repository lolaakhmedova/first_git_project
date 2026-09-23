package m15_selection_statements_2;

public class NUmberOfBedrooms {
    static void main() {
       int numberOfBedroom=5;

        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");

       switch(numberOfBedroom){
           case 1 ->{
               System.out.println(numberOfBedroom);
               System.out.println("One Bedroom Selected");
               System.out.println("Starting Price: 1100");
           }
           case 3->{
               System.out.println(numberOfBedroom);
               System.out.println("Three Bedroom Selected");
               System.out.println("Starting Price: 2550");
           }
           default-> {
               System.out.println(numberOfBedroom);
               System.out.println("Sorry, we do not offer that many bedrooms");
           }
       }


    }
}
