/*
 * SE1011
 * Fall 2018
 * Wiener Dog
 * Name: Brad Dennis
 * Created: 10/18/2018
 */
package edu.msoe.weinerdog;

/**
 * This class models the wiener dogs in the
 * weiner dog races.
 *
 * @author Brad
 * @version 2016.10.18
 */
public class WienerDog {
    private int age;
    private double weight;
    private String name;
    private String owner;
    private String league;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    /**
     * Constructor setting the minimum required attributes.
     *
     * @param age The age of the dog to assign to the appropriate class.  Pupper or Doggo,
     * @param weight The weight of the dog at the time of entry in the race.
     */
    public WienerDog(int age, double weight) {
        //TODO set these attributes by calling other instance methods.
    }


    //TODO addScores a convenience constructor that accepts parameters for all of the dogs attributes, except league.
    //Note: Do not copy code, reuse the first constructor.

    //TODO addScores an equals override

    //TODO write a class method that accepts two dog instances as parameters.
    //Copy the attributes from the first to second.
}
