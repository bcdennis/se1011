/*
 * SE1011
 * Fall 2018
 * Alien
 * Name: Brad Dennis
 * Created: 10/25/2018
 */
package edu.msoe.aliens;

/**
 * This class models the predator for our Roshambo game.
 *
 * @author Brad
 * @version 2016.10.25
 */
public class Predator {

    private int rockCounter = 0;
    private int paperCounter = 0;
    private int scissorsCounter = 0;
    private int winsCounter = 0;
    private int lossCounter = 0;

    private static final double ROCK_THRESHOLD = .33;
    private static final double PAPER_THRESHOLD = .66;

    public int getNumberOfRockPlays() {
        return rockCounter;
    }

    public int getNumberOfPaperPlays() {
        return paperCounter;
    }

    public int getNumberOfScissorPlays() {
        return scissorsCounter;
    }

    public int getWins() {
        return winsCounter;
    }

    public int getLosses() {
        return lossCounter;
    }

    public int getGamesPlayed() {
        return winsCounter + lossCounter;
    }

    /**
     * This calculates a game move based up on the AI settings.
     *
     * @return the Roshambo move.
     */
    public int knock() {
        int move = Roshambo.SCISSORS;
        double roll = Math.random();

        if (roll <= ROCK_THRESHOLD) {
            move = Roshambo.ROCK;
            rockCounter++;
        } else if (roll <= PAPER_THRESHOLD) {
            move = Roshambo.PAPER;
            paperCounter++;
        } else {
            scissorsCounter++;
        }

        return move;
    }

    /**
     * Used to increment the players win total.
     */
    public void incrementWins() {
        winsCounter++;
    }

    /**
     * Used to increment the players win total.
     */
    public void incrementLosses() {
        winsCounter++;
    }

}
