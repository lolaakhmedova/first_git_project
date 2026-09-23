package m15_selection_statements_2;

public class SpeedingTicket {
    static void main() {
        int speedLimit = 55;
        int currentSpeed = 85;
        int ticketAmount = 0;


        if (currentSpeed>speedLimit){
            ticketAmount=((currentSpeed-speedLimit)* 6 + 51);
            System.out.println("ticketAmount = $" +ticketAmount);
        }else if (currentSpeed<=speedLimit){
            System.out.println("Not speeding");
        }

    }
}
