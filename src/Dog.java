/*
 * SE1011
 * Fall 2018
 * Dog
 * Name: Brad Dennis
 * Created: 10/19/2018
 */

/**
 * This class models the dogs.
 *
 * @author Brad
 * @version 2016.10.19
 */
public class Dog {

    private String breed;
    private String color;
    private String name;

    public static final String SIT = "sit";
    public static final String SPEAK = "speak";
    public static final String WAG_TAIL = "good dog";


    public String getBreed() {
        return breed;
    }


    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
        this.wagTail();
    }

    public void wagTail() {
        System.out.println(getName() + " wags their tail.");
    }

    public void speak() {
        System.out.println("arf arf");
    }

    public void sit() {
        System.out.println(getName() + " sits.");
    }

    public void acceptCommand(String command) {
        switch(command) {
            case SIT:
                sit();
                break;
            case SPEAK:
                speak();
                break;
            case WAG_TAIL:
                wagTail();
                break;
            default:
                // the dog isn't trained.
                System.out.println("The dog doesn't understand the command '" + command + "'");
        }
    }


    public void pet() {

    }

    public boolean feed(String treats) {

        return false;
    }
}
