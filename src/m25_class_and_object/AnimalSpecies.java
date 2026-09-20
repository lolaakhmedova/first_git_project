package m25_class_and_object;

public class AnimalSpecies {
    public String name;
    public double population;
    public double growthRate;



    public double calculateInYears(int year){
        double estimatedPopulation = population + (population * (growthRate / 100) * year);

        return  estimatedPopulation;

    }

    public String toString() {
        double fiveYearEstimate = calculateInYears(5);

        return "The " + name + " currently has a population of " + population + " million" + "\nThe growth rate is sitting around " +
                growthRate + " %, so we predict the population in 5 years will be: " + fiveYearEstimate ;

    }
}


