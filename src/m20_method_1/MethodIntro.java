package m20_method_1;

public class MethodIntro {

    static void main() {
        eat();
        walk();
        MethodIntro.play();
    }

    public static void eat() {
        System.out.println("I am eating");
    }

    public static void walk(){
        System.out.println("I am walking");
    }

    public static void play(){
        walk();
        System.out.println("I am playing");
    }
}
