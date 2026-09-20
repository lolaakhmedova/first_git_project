package m15_selection_statements_2;

public class PizzaOrder {
    static void main() {
        char size  = 'L';
        char addPepperoni = 'N';
        char extraCheese = 'N';
        double price=0;

       if (size=='S'){
           price+= 13.99 ;
        }else if (size=='M'){
           price+=15.99;
        }else if (size=='L'){
           price+=18.79;}


       if (addPepperoni=='Y'){
          price+=1.50;
       }else if (addPepperoni=='Y'){
          price+=1.90;
       }else if (addPepperoni=='Y') {
          price += 2.10;}

       if (extraCheese=='Y'){
           price+=1.25;
       }else if (extraCheese=='Y') {
           price += 1.65;
       }else if (extraCheese=='Y' ) {
           price += 2.00;}

    System.out.println("Size:" + size +"\nAdd Pepperoni: "+addPepperoni+ "\nExtra Cheese:" + extraCheese+"\nTotal price: $" + price);

    }
}
