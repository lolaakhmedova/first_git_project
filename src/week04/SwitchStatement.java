package week04;

public class SwitchStatement {
    static void main() {
        int option = 3;

        switch (option) {
            case 1 -> System.out.println("Start New Game");
            case 2 -> System.out.println("Resume Game");
            case 3 -> System.out.println("Exit");
            default -> System.out.println("Invalid option");
        }
        System.out.println("--------------------------");


        int floor = 11;
        String companies;

        switch (floor) {
            case 1 -> companies = "Cydeo, InfoSys, Haxaware";
            case 2 -> companies = "Meta, HP, Starlink";
            case 3 -> companies = "Amazon, Etsy, Ebay";
            case 4 -> companies = "OpenAI, Grok, Perplexity";
            default -> companies = "Invalid floor";
        }

        System.out.println("Floor: " + floor);
        System.out.println("Companies: " + companies);

    }
}
