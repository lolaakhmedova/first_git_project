package m14_selection_statements_1;

public class Watermelon {
    static void main() {
      int number =60;
      boolean isEnough=false;

      if (number>=50){
          System.out.println("I have more than 20 watermelon");
          isEnough=true;
      }
      if (isEnough){
          System.out.println("Good job!");
      }
     if (!isEnough){
          System.out.println(("I need more watermelon"));
      }
    }
}




