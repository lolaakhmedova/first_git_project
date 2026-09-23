package m18_loops_3;

public class ZombieAttack {
    static void main() {
        int inhabitants=6;
        int day=0;

        while (inhabitants>0){
            System.out.println( "Day"+ day +"["+inhabitants+"]");
            day++;
            inhabitants/=2;
            if(inhabitants==0){
                System.out.println("----EXTINCT----");
            }


        }
    }
}
