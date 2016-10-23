/*
 * SE1011
 * Fall 2018
 * Dog Race Driver
 * Name: Brad Dennis
 * Created: 10/18/2018
 */
package edu.msoe.weinerdog.solution;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * This is a simple driver for the dog race app.
 * @author Brad
 * @version 2016.10.18
 */
public class App{


    public static void main(String[] args) throws CloneNotSupportedException {
        Race pupperRace = new Race(Race.PUPPER);
        Race secondPupperRace = new Race(Race.PUPPER);
        Race doggoRace = new Race(Race.DOGGO);

        WienerDog jazz = new WienerDog(4, 17.0);
        jazz.setName("Jazz");
        jazz.setOwner("Dr. Dennis");

        WienerDog abby = new WienerDog(5, 22.0);
        abby.setName("Abby");
        abby.setOwner("Dr. Dennis");

        // Code to test the new constructors.
        WienerDog rufus = new WienerDog(2, 15.0, "Rufus", "Dr. Dennis");
        WienerDog fritz = new WienerDog(7, 14.0, "Fritz", "Dr. Dennis");
        WienerDog daisy = new WienerDog(3, 17.0, "Daisy", "Dr. Dennis");

        System.out.println("Registering for the first Pupper race.");
        System.out.println("**************************************");

        register(pupperRace, jazz);
        register(pupperRace, abby);
        register(pupperRace, rufus);
        register(pupperRace, fritz);
        register(pupperRace, daisy);

        System.out.println();
        System.out.println("Registering for the second Pupper race.");
        System.out.println("**************************************");

        register(secondPupperRace, jazz);
        register(secondPupperRace, abby);
        register(secondPupperRace, rufus);
        register(secondPupperRace, fritz);
        register(secondPupperRace, daisy);

        System.out.println();
        System.out.println("Registering for the Doggo race.");
        System.out.println("**************************************");

        register(doggoRace, jazz);
        register(doggoRace, abby);
        register(doggoRace, rufus);
        register(doggoRace, fritz);
        register(doggoRace, daisy);

        System.out.println();
        System.out.println("There are a total of " + Race.getTotalRegistrants() + " entrants in the three races.");



        System.out.println("\n\nJazz's age is : " + jazz.getAge());

        WienerDog jazz2 = jazz;
        jazz2.setAge(3);

        //What will this print?  Why?
        System.out.println("Jazz's age is now: " + jazz.getAge());

        WienerDog abbyCopy = new WienerDog(0, 0);
        WienerDog.copy(abby, abbyCopy);
        System.out.println("Does the Abby Copy equal Abby? " + abby.equals(abbyCopy));

        WienerDog abbyClone = (WienerDog)abby.clone();
        System.out.println("Does the Abby Clone equal Abby? " + abby.equals(abbyClone));
        System.out.println("Does the Abby Clone == Abby? " + (abby == abbyClone));

        System.out.println(abby);
        System.out.println(abbyCopy);
        System.out.println(abbyClone);
        System.out.println(jazz);

    }

    private static void register(Race race, WienerDog dog) {
        String qualifier = "could not be";

        if (race.register(dog)) {
            qualifier = "was";
        }

        System.out.println(dog.getName() + " " + qualifier + " registered in the " + race + ".");
    }
}
