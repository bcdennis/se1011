/*
 * SE1011
 * Fall 2018
 * Race
 * Name: Brad Dennis
 * Created: 10/18/2018
 */
package edu.msoe.weinerdog.solution;

/**
 * This is class models a wiener dog race.
 *
 * @author Brad
 * @version 2016.10.18
 */
public class Race {
    private static int totalRegistrants = 0;

    private int league = 0;
    private int registrants = 0;

    public static final int PUPPER = 0;
    public static final int DOGGO = 1;

    private static final String PUPPER_LEAGUE = "Pupper League";
    private static final String DOGGO_LEAGUE = "Doggo League";

    private static final int PUPPER_AGE_LIMIT = 3;
    private static final double WEIGHT_LIMIT = 20.0;

    public int getRegistrants() {
        return registrants;
    }

    /**
     * The total number of registered dogs across all races.
     *
     * @return the number of registered dogs.
     */
    public static int getTotalRegistrants() {
        return Race.totalRegistrants;
    }



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

        if ((dog.getWeight() < WEIGHT_LIMIT)) {


            if (league == PUPPER && dog.getAge() <= PUPPER_AGE_LIMIT) {
                registrants++;
                wasRegistered = true;

                //TODO addScores a feature such that a single global counter is kept for all registrants.
                Race.totalRegistrants++;
                //TODO if a dog was registered, set it's league.
                dog.setLeague(Race.PUPPER_LEAGUE);

            } else if (league == DOGGO  && dog.getAge() > PUPPER_AGE_LIMIT) {
                registrants++;
                wasRegistered = true;

                Race.totalRegistrants++;
                dog.setLeague(Race.DOGGO_LEAGUE);
            }
        }

        return wasRegistered;
    }

    /**
     * Returns the friendly name of the race.
     *
     * @return the race name.
     */
    public String toString() {
        String buffer = "Unknown League Race";
        if (this.league == PUPPER) {
            buffer = "Pupper League Race";
        } else if (this.league == DOGGO) {
            buffer = "Doggo League Race";
        }

        return buffer;
    }

}
