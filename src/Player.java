/**
 * Created by Jayme Peoples on 7/10/2017.
 */
public abstract class Player {
    private String name;

    public Player(){}//blank constructor

    public Player( String name, Roshambo choice ) {//filled constructor
        this.name = name;
        this.choice = choice;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Roshambo getChoice() {
        return choice;
    }

    public void setChoice( Roshambo choice ) {
        this.choice = choice;
    }

    public Roshambo choice;

    public abstract Roshambo generateRoshambo();


}