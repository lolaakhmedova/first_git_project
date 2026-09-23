package m15_selection_statements_2;

public class ConfirmationBot {
    static void main() {
        char response='h';

        switch (response){
            case 'y'-> System.out.println("Your request is being processed");
            case 'n'-> System.out.println("Thank you for your consideration");
            case 'h'-> System.out.println("Sorry, no live agents are currently available");
            default-> System.out.println("`Invalid entry, please try again");
        }
    }
}
