/*
 * SE1011
 * Fall 2018
 * Dog Race Driver
 * Name: Brad Dennis
 * Created: 10/18/2018
 */
package edu.msoe.weinerdog;

/**
 * This is a simple driver for the dog race app.
 * @author Brad
 * @version 2016.10.18
 */
public class App{

    private int test;

    public static void main(String[] args) {
        Race pupperRace = new Race(Race.PUPPER);
        Race doggoRace = new Race(Race.DOGGO);

        WienerDog jazz = new WienerDog(4, 17.0);
        jazz.setName("Jazz");
        jazz.setOwner("Dr. Dennis");

        WienerDog abby = new WienerDog(5, 22.0);
        jazz.setName("Abby");
        jazz.setOwner("Dr. Dennis");
/*
        // Code to test the new constructors.
        WienerDog rufus = new WienerDog(2, 15.0, "Rufus", "Dr. Dennis");
        WienerDog fritz = new WienerDog(7, 14.0, "Fritz", "Dr. Dennis");
        WienerDog daisy = new WienerDog(3, 17.0, "Daisy", "Dr. Dennis");
*/
        if (pupperRace.register(jazz)) {
            System.out.println(jazz.getName() + " was registered in the Pupper race.");
        } else {
            System.out.println(jazz.getName() + " could not be registered in the Pupper race.");
        }


        System.out.println("Jazz's age is : " + jazz.getAge());

        WienerDog jazz2 = jazz;
        jazz2.setAge(3);

        //What will this print?  Why?
        System.out.println("Jazz's age is now: " + jazz.getAge());

        // Write more code to test the other new features.

    }

}
