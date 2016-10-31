/*
 * SE1011
 * Fall 2018
 * Race
 * Name: Brad Dennis
 * Created: 10/18/2018
 */
package edu.msoe.weinerdog;

/**
 * This is class models a wiener dog race.
 *
 * @author Brad
 * @version 2016.10.18
 */
public class Race {

    private int league = 0;
    private int registrants = 0;

    public static final int PUPPER = 0;
    public static final int DOGGO = 1;

    private static final int PUPPER_AGE_LIMIT = 3;
    private static final double WEIGHT_LIMIT = 20.0;

    /**
     * Race constructor. Races require a league; Doggo or Pupper
     * @param league The league of race to create.
     */
    public Race(int league) {
        this.league = league;
    }

    /**
     * Registers the dog for the race.  Obese dogs are not registered.
     *
     * @param dog The dog to register.
     * @return true if the dog was able to registered in the race.
     */
    public boolean register(WienerDog dog) {
        boolean wasRegistered = false;

        //TODO addScores a feature such that a single global counter is kept for all registrants.

        //TODO if a dog was registered, set it's league.
        
        if (dog.getWeight() < WEIGHT_LIMIT) {
            if (league == PUPPER && dog.getAge() <= PUPPER_AGE_LIMIT) {
                registrants++;
                wasRegistered = true;
            } else if (league == DOGGO) {
                registrants++;
                wasRegistered = true;
            }
        }

        return wasRegistered;
    }
}
