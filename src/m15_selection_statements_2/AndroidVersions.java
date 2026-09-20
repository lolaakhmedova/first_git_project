package m15_selection_statements_2;

public class AndroidVersions {
    static void main() {
        String version="1.5";
        switch(version){
            case "1.5" -> System.out.println("Cupcake");
            case "1.6" -> System.out.println("Donut");
            case "2.1"-> System.out.println("Eclair");
            case "2.2"-> System.out.println("Froyo");
            case "2.3"-> System.out.println("Gingerbread");
            case "3.1"-> System.out.println("Honeycomb");
            case "4.0"-> System.out.println("Ice Cream Sandwich");
            case "4.1"-> System.out.println("Jelly Bean");
            case "4.4"-> System.out.println("KitKat");
            case "5.0"-> System.out.println("Lollipop");
            case "8.0"-> System.out.println("Oreo");
            case "9.0"-> System.out.println("Pie");
            default->System.out.println("Not a valid version");

        }

    }
}

