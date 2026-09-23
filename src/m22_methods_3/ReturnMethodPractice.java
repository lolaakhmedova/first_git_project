package m22_methods_3;

public class ReturnMethodPractice {
    static void main() {

        double result = calculate(11.5, '*', 0.5);
        System.out.println(result);

    }
 public static double calculate (double num1, char mathOperator, double num2){

        boolean validOperator = mathOperator=='+' || mathOperator=='-'|| mathOperator=='*' || mathOperator=='/';
        if (!validOperator){
            return 0;
        }
       double  result = ( mathOperator=='+')? num1+num2 :( mathOperator=='-')? num1 -num2
                        :( mathOperator=='*')? num1 * num2 : ( mathOperator=='/')? num1 /num2 : num1%num2;
        return result;


 }
}
