package m20_method_1;

public class HierarchicalMethodCalls {
    static void main() {
        //read();
        //write();
        learn();

    }

    public static void read(){
        System.out.println("I am reading");
    }

    public static void write(){
        System.out.println("I am writing");
    }

    public static void learn(){
        read();
        System.out.println("I am learning");
    }



}
