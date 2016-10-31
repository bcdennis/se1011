/*
 * SE1011
 * Fall 2018
 * Wiener Dog
 * Name: Brad Dennis
 * Created: 10/18/2018
 */
package edu.msoe.weinerdog.solution;

/**
 * This class models the wiener dogs in the
 * wiener dog races.
 *
 * @author Brad
 * @version 2016.10.18
 */
public class WienerDog implements Cloneable{
    private int age;
    private double weight;
    private String name = "";
    private String owner = "";
    private String league = "";

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
        setAge(age);
        setWeight(weight);
    }

    //TODO addScores a convenience constructor that accepts parameters for all of the dogs attributes, except league.
    //Note: Do not copy code, reuse the first constructor.

    /**
     * An overloaded constructor to provide convenience to developers to set all the dogs attributes.
     *
     * @param age the age of the dog
     * @param weight the weight of the dog
     * @param name the name of the dog
     * @param owner the dog's owner
     */
    public WienerDog(int age, double weight, String name, String owner) {
        this(age, weight);
        setName(name);
        setOwner(owner);
    }

    //TODO addScores an equals override
    public boolean equals(Object object) {
        boolean isEqual = false;
        if (object != null && object instanceof WienerDog) {
            WienerDog otherDog = (WienerDog) object;
            isEqual = (getAge() == otherDog.getAge())
                     && (getWeight() == otherDog.getWeight())
                     && (getOwner().equals(otherDog.getOwner()));
        }

        return isEqual;
    }

    /**
     * Overriding the clone method.
     *
     * @return an exact copy of the dog.
     * @throws CloneNotSupportedException if object does not support cloning.
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        String buffer = getName() + " is a "
                      + getAge() + " year old dachshund "
                      + "that weighs " + getWeight()
                      + " that is owned by " + getOwner();

        if (getLeague().isEmpty()) {
            buffer += " and is not registered in any races.";
        } else {
            buffer += " and is registered to race in a " + getLeague() + " race.";
        }

        return buffer;
    }


    //TODO write a class method that accepts two dog instances as parameters.

    /**
     * A method to clone a dog.
     * @param source the original dog to copy from.
     * @param target the dog object to copy to.
     */
    public static void copy(WienerDog source, WienerDog target) {
        target.age = source.age;
        target.weight = source.weight;
        target.name = source.name;
        target.owner = source.owner;
        target.league = source.league;
    }

}
