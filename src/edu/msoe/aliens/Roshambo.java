/*
 * SE1011
 * Fall 2018
 * Alien
 * Name: Brad Dennis
 * Created: 10/25/2018
 */
package edu.msoe.aliens;

/**
 * This class encapsulates the game rules.
 *
 * @author Brad
 * @version 2016.10.25
 */
public class Roshambo {
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 3;

    private Roshambo() {
        // make sure no one can instantiate the Roshambo class.
    }

    /**
     * Determines if the first play beats the second play.
     *
     * @param firstPlay The first RPS move.
     * @param secondPlay The second RPS move.
     * @return true if the first beats the second.  False, otherwise.
     */
    public static boolean checkWin(int firstPlay, int secondPlay) {
        boolean beats = false;

        switch(firstPlay) {
            case ROCK:
                switch (secondPlay) {
                    case ROCK:
                    case PAPER:
                        beats = false;
                        break;
                    case SCISSORS:
                        beats = true;
                        break;
                    default:
                        beats = true;
                        // unknown second player move.  Automatic winner
                }
                break;
            case PAPER:
                switch (secondPlay) {
                    case SCISSORS:
                    case PAPER:
                        beats = false;
                        break;
                    case ROCK:
                        beats = true;
                        break;
                    default:
                        beats = true;
                        // unknown second player move.  Automatic winner
                }
                break;
            case SCISSORS:
                switch (secondPlay) {
                    case SCISSORS:
                    case ROCK:
                        beats = false;
                        break;
                    case PAPER:
                        beats = true;
                        break;
                    default:
                        beats = true;
                        // unknown second player move.  Automatic winner
                }
                break;
            default:
                // unknown move selected, automatic loser.
        }

        return beats;
    }
}
