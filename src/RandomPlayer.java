/**
 * Created by Jayme Peoples on 7/11/2017.
 */
public class RandomPlayer extends Player{
    public RandomPlayer(){//blank constructor

    }
    public RandomPlayer( String userName, Roshambo choice) {
        super(userName, choice);
    }

    @Override
    public Roshambo generateRoshambo() {//Randomly select R/P/S
        int randomNum = (int) (Math.random() *2 + 1);//Math random returns num. between 0 and 1 therefore *2 will return an int 0,1,or 2 respectively

        switch (randomNum) {
            case (0):
                choice = Roshambo.ROCK;
                break;
            case (1):
                choice = Roshambo.PAPER;
                break;
            case (2):
                choice = Roshambo.SCISSORS;
                break;
            default:
                System.out.println("Error with switch logic");
                break;
        }
        return choice;
    }

}

