/**
 * Created by Jayme Peoples on 7/11/2017.
 */
public class RockPlayer extends Player {

    public RockPlayer(){//blank constructor

    }
    public RockPlayer( String userName, Roshambo choice){
        super(userName, choice);

    }
    @Override
    public Roshambo generateRoshambo() {//1) Always Rock

        return Roshambo.ROCK;
    }

}
