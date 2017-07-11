import java.util.Scanner;

/**
 * Created by Jayme Peoples on 7/11/2017.
 */
public class RoshamboApp {
    public static void main( String[] args ) {
        //all classes will tie into this
        Scanner scnr = new Scanner(System.in);
        String userName = "";
        String userChoice = "";

        RockPlayer c1 = new RockPlayer();
        RandomPlayer c2 = new RandomPlayer();
        HumanPlayer player = new HumanPlayer();

        System.out.println("Welcome to the Rock, Paper, Scissors App");
        System.out.println("Please enter your name");
        userName = scnr.nextLine();
        player.setName(userName);

        do {
            System.out.println("Who would you like to play against " + userName + "?" + "Please choose c1 or c2");
            userChoice = scnr.nextLine();

            Roshambo rockChoice = c1.generateRoshambo();
            Roshambo randomChoice = c2.generateRoshambo();
            Roshambo playerSelection = player.generateRoshambo();

            if (userName.equalsIgnoreCase("c1")){
                System.out.println("C1: " + rockChoice);
                System.out.println(userName + ": " + playerSelection);

                if ()
            }
        }

        RockPlayer computer1 = new RockPlayer();
        System.out.println("Computer 1 " + computer1.generateRoshambo().toString());

        RandomPlayer computer2 = new RandomPlayer();
        System.out.println("Computer 2 " + computer2.generateRoshambo().toString());


    }

    }

