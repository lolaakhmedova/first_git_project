package week06;

public class voidMethods {
    static void main() {
        for (int i = 0; i < 3; i++) {
            ringBell();

        }

        System.out.println("------------------------------");

        greetUser("lola");
        greetUser("Hadiya");
        greetUser("Iymona");

        System.out.println("------------------------------");

        repeatWord("Hello", 3);
        repeatWord("java", 5);

    }

    public static void ringBell() {
        System.out.println("🔔 Ring Ring!");
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome back!");
    }

    public static void repeatWord(String word, int times){
        for (int i = 0; i < times; i++) {
            System.out.print(word + " ");
        }
        System.out.println();
    }




}
