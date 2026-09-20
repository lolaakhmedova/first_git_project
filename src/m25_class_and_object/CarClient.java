package m25_class_and_object;

public class CarClient {
    static void main() {
        Car car=new Car();

        car.make="Toyota";
        car.model="corolla";
        car.year=2023;
        car.color="Black";
        car.price=30.000;

        car.start();
        car.drive();
        car.stop();
        car.showCurrentSpeed(85, 70);

        System.out.println(car);
        System.out.println("-----------------------------------------");

        Car car2=new Car();

        car2.make="Mercedes";
        car2.model="AMG coupe";
        car2.year=2020;
        car2.color="White";
        car2.price=80.000;

        car2.start();
        car2.drive();
        car2.stop();
        car2.showCurrentSpeed(85, 70);

        System.out.println(car2);








    }
}
