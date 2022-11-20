import java.util.Scanner;

public class Game_Chair {
    public Player Computer = new Player();
    public Player Player_2 = new Player();
    private boolean user_selected = true;

    public void Start() {
        Computer.Play();

        System.out.println("Welcome to BetMore");
        Scanner in = new Scanner(System.in);
        int counter = 5;
        String response;
        while(user_selected) {
            Player_2.Play();
            counter--;
            System.out.println("--------------------------------------------");
            System.out.println("Your current Card is " + Player_2.getCurrentCard());
            if (counter == 0) {
                System.out.println("--------------------------------------------");
                in.close();
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
                in.close();
                user_selected = false;
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
