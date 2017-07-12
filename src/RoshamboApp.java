import java.util.Scanner;

/**
 * Created by Jayme Peoples on 7/11/2017.
 */
public class RoshamboApp {
    public static void main( String[] args ) {
        //all classes will tie into this
        Scanner scnr = new Scanner(System.in);
        String userName;
        String userChoice;

        RockPlayer c1 = new RockPlayer();//calls the other classes to the main
        RandomPlayer c2 = new RandomPlayer();
        HumanPlayer player = new HumanPlayer();

        System.out.println("Welcome to the Rock, Paper, Scissors App");
        System.out.println("Please enter your name");
        userName = scnr.nextLine();
        player.setName(userName);

        do {
            System.out.println("Who would you like to play against " + userName + "?" + " Please choose c1 or c2");
            userChoice = scnr.nextLine();

            Roshambo rockChoice = c1.generateRoshambo(); //sets each  player to enum Roshambo
            Roshambo randomChoice = c2.generateRoshambo();
            Roshambo playerSelection = player.generateRoshambo();

            if (userChoice.equalsIgnoreCase("c1")) {
                System.out.println("C1: " + rockChoice);
                System.out.println(player.getName() + ": " + playerSelection);//use player.getName instead of username so name can
                //be changed under HumanPlayer and if any changes are made to Player.java they will be made here as well

                if (playerSelection.equals(rockChoice)) {
                    System.out.println("Draw");
                } else if (playerSelection.toString().equalsIgnoreCase("Scissors")) {//toString returns a string.
                    //without it I get an error
                    System.out.println(player.getName() + " " + "loses");
                } else if (playerSelection.toString().equalsIgnoreCase("Paper")) {
                    System.out.println(player.getName() + " " + "wins!");
                    }
                }
                if (userChoice.equalsIgnoreCase("c2")) {
                    System.out.println("C2 " + randomChoice);
                    System.out.println(player.getName() + ": " + playerSelection);

                    if (playerSelection.equals(randomChoice)) {
                        System.out.println("Draw");
                    } else if (playerSelection.toString().equalsIgnoreCase("Scissors")) {
                        if (randomChoice.toString().equalsIgnoreCase("Rock")) {
                            System.out.println(player.getName() + " loses");
                        } else {
                            System.out.println(player.getName() + " wins!");
                        }
                    } else if (playerSelection.toString().equalsIgnoreCase("Rock")) {
                        if (randomChoice.toString().equalsIgnoreCase("Scissors")) {
                            System.out.println(player.getName() + " wins!");
                        } else {
                            System.out.println(player.getName() + " loses");
                        }
                    } else if (playerSelection.toString().equalsIgnoreCase("Paper")) {
                        if (randomChoice.toString().equalsIgnoreCase("Scissors")) {
                            System.out.println(player.getName() + " loses");
                        } else {
                            System.out.println(player.getName() + " wins!");
                        }
                    }
                }
                System.out.println("Would you like to play again? (y/n)");
                userChoice = scnr.nextLine();
            }
            while (userChoice.equalsIgnoreCase("y")) ;
            System.out.println(("Thanks for playing, " + player.getName() + "." + " Let's play again soon."));
        }
    }

