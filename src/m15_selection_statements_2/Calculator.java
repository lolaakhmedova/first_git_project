package m15_selection_statements_2;

public class Calculator {
    static void main() {

        double num1=100,
                num2=20;
        char operator = '+';

        switch (operator){
            case '+':
                System.out.println("Addition "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtruction "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiply "+(num1*num2));
                break;
            case '/':
                System.out.println("Division "+(num1/num2));
            default:
                System.out.println("Invalid Operator");
        }


    }
}
