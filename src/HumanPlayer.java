import java.util.Scanner;

/**
 * Created by Jayme Peoples on 7/11/2017.
 */
public class HumanPlayer extends Player {

    Scanner scnr = new Scanner(System.in);
    String userInput = "";

    public HumanPlayer() {//blank constructor

    }

    public HumanPlayer( String userName, Roshambo choice ) {
        super(userName, choice);

    }

    @Override
    public Roshambo generateRoshambo() {//1) Need input and return chosen value
        System.out.println("Please choose Rock, Paper or Scissors (R/P/S): ");
        userInput = scnr.nextLine();

        if (userInput.equalsIgnoreCase("r")) {
            choice = Roshambo.ROCK;
        } else if (userInput.equalsIgnoreCase("p")) {
            choice = Roshambo.PAPER;
        } else if (userInput.equalsIgnoreCase("s")) {
            choice = Roshambo.SCISSORS;
        }
        return choice;
    }
}

