package m23_method_overloading;

public class MethodOverloadPractice {

    static void main() {

        double areaOfCircle = calculateArea(3.5);
        System.out.println("Area of circle is "+ areaOfCircle);


        double areaOfRectangle = calculateArea(2.5, 3.5);
        System.out.println("Area of rectangle is "+ areaOfRectangle);

    }

    public static double calculateArea(double radius){
        return radius * radius * 3.14;
    }

    public static double calculateArea(double lenght, double width){
        return lenght * width;
    }
}
