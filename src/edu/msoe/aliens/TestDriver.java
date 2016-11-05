/*
 * SE1011
 * Fall 2018
 * Alien
 * Name: Brad Dennis
 * Created: 10/25/2018
 */
package edu.msoe.aliens;

import java.util.Random;

public class TestDriver {
    private static final long SEED = 40943466621L;

    public static void main(String[] args) {
        randomWithSeedDemo();
        //predatorTests();
    }

    private static void predatorTests() {
        Predator predator = new Predator(SEED);


        //rng should be 0.10026627147996814
        int result = predator.knock();
        if (result != Roshambo.ROCK) {
            System.out.println("Rock test failed.");
        } else {
            System.out.println("Rock test passed.");
        }

        // rng should be 0.9408666197459835
        result = predator.knock();
        if (result != Roshambo.SCISSORS) {
            System.out.println("Scissors test failed.");
        } else {
            System.out.println("Scissors test passed.");
        }

        // rng should be 0.919661823722702
        predator.knock();

        /*
           the next 2 random values
           0.05820835390750978
           0.09823879011308156
        */

        predator.knock();
        predator.knock();

        // rng should be 0.3970192713555122
        result = predator.knock();
        if (result != Roshambo.PAPER) {
            System.out.println("Paper test failed.");
        } else {
            System.out.println("Paper test passed.");
        }


        predator.knock();
        predator.knock();
        predator.knock();
        predator.knock();

        // after ten knocks the state of the predator should be:
        // # rocks = 3
        // # papers = 4
        // # scissors = 3

        if (predator.getNumberOfRockPlays() != 3) {
            System.out.println("Rock counter test failed.");
        } else {
            System.out.println("Rock counter test passed.");
        }


        if (predator.getNumberOfPaperPlays() != 4) {
            System.out.println("Paper counter test failed.");
        } else {
            System.out.println("Paper counter test passed.");
        }


        if (predator.getNumberOfScissorPlays() != 3) {
            System.out.println("Scissor counter test failed.");
        } else {
            System.out.println("Scissor counter test passed.");
        }

        // test incrementors

        predator.incrementWins();
        predator.incrementWins();

        if (predator.getWins() != 2) {
            System.out.println("Win counter test failed.");
        } else {
            System.out.println("Win counter test passed.");
        }

        predator.incrementLosses();
        predator.incrementLosses();

        if (predator.getLosses() == 2) {
            System.out.println("Loss counter test passed.");
        } else {
            System.out.println("Loss counter test failed.");
        }

        if (predator.getGamesPlayed() == 4) {
            System.out.println("Games played counter test passed.");
        } else {
            System.out.println("Games played counter test failed.");
        }

    }

    private static void randomWithSeedDemo() {
        Random rng = new Random(SEED);

        for (int i = 0; i < 10; i++) {
            System.out.println(rng.nextDouble());
        }
    }

}
