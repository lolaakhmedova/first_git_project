package m28_string_class_part2;

public class Recipe {

    public String name;
   public String ingredients;
   public int servingSize;
   public  double cost;

   public double costPerPerson(){
       double result =  cost/ servingSize;
       return result;

   }

    public String toString() {
        return "Recipe for " + name + " will require these ingredients: \n" +
                 ingredients + "\nThis dish will serve " + servingSize +" people and cost a total of  $" + cost;};


}
