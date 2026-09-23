package m15_selection_statements_2;

public class SwitchConstant {
    public static final int OPTION_1 = 1;
    public static final int OPTION_2 = 2;
    public static final int OPTION_3 = 3;

    static void main() {

        int choice=3;
    switch (choice){
        case OPTION_1->System.out.println("Option 1 is selected");

        case  OPTION_2->System.out.println("Option 2 is selected");

        case  OPTION_3->System.out.println("Option 3 is selected");
        default->System.out.println("No values available");
    }



    }
}
