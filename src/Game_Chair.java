import java.util.Scanner;

public class Game_Chair {
    public Player Computer = new Player();
    public Player Player_2 = new Player();

    public void Start() {
        Computer.Play();

        System.out.println("Welcome to BetMore");
        Scanner in = new Scanner(System.in);
        int counter = 6;
        String response;
        for (int i = 0; i < 6; i++) {
            Player_2.Play();
            counter--;
            System.out.println("--------------------------------------------");
            System.out.println("Your current Card is " + Player_2.getCurrentCard());
            if (i == 5) {
                System.out.println("--------------------------------------------");
                break;
            }
            System.out.println("Would you like to draw another card? (" + counter + " remaining) (y/n)");
            System.out.println("--------------------------------------------");
            response = in.next();
            while (!response.equals("y") && !response.equals("n")) {
                System.out.println("\nInvalid response. Try again.");
                response = in.next();
            }
            if (response.equals("n")) {
                System.out.println("--------------------------------------------");
                break;
            } else if (response.equals("y")) {
                System.out.println("\nPicking new card now...");
            }

        }

    }

    public Player FindWinner(Player Computer, Player Player_2) {
        System.out.println("Calculating winner now...");
        System.out.println("--------------------------------------------");
        if (Computer.getCurrentCard() > Player_2.getCurrentCard()) {
            return Computer;
        } else {
            return Player_2;
        }
    }
}
