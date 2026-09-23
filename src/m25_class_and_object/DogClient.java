package m25_class_and_object;

public class DogClient {

    static void main() {
        Dog dog1 = new Dog();

        dog1.name="Debbie";
        dog1.age = 2;
        dog1.breed = "Husky";
        dog1.color = "Brown";

        System.out.println("Name:" + dog1.name);
        System.out.println("Age: " +dog1.age);
        System.out.println("Color: " +dog1.color);
        System.out.println("Breed: " + dog1.breed);
        dog1.bark();
        dog1.eat();
        dog1.sleep();

        System.out.println(dog1);
        System.out.println("----------------------------------------------");

        Dog dog2 = new Dog();
        dog2.name=" Yulbars";
        dog2.age=5;
        dog2.breed="Labrador";
        dog2.color="White";

        System.out.println(dog2);

        Dog dog3 = new Dog();
    }
}
