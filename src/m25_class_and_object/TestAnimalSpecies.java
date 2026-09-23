package m25_class_and_object;

public class TestAnimalSpecies {
    static void main() {
        AnimalSpecies  species = new AnimalSpecies();

        species.name = "Lion";
        species.population = 15;
        species.growthRate = 1.5;

        System.out.println(species.calculateInYears(5));
        System.out.println(species);





    }
}
