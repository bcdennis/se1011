/*
 * SE1011
 * Fall 2018
 * Question.java
 * Name: Brad Dennis
 * Created: 10/30/2018
 */
package edu.msoe.arrays;

/**
 * This class models an SE1011 exam question.  There is a maximum of 20 students in a given SE1011 section.
 * Questions must have a non-negative value and non-empty text.
 *
 * @author bdennis
 * @version 2016.10.30
 */
public class Question {
    private static final int NO_SCORE = -1;

    private String text = "Default question text.";
    private int points = 0;

    private int[] scores;
    private int numberOfScores = 0;


    public String getText() {
        return text;
    }

    /**
     * Sets the question text.  Must not be empty.
     *
     * @param text The text for the question.
     */
    public void setText(String text) {
        if (!text.isEmpty()) {
            this.text = text;
        }
    }

    public int getPoints() {
        return points;
    }

    /**
     * Sets the number of points for this exam.  Must be non-negative.
     *
     * @param points The point value of the question.
     */
    public void setPoints(int points) {
        if (points > NO_SCORE) {
            this.points = points;
        }
    }


    public int getScoreCount() {
        return numberOfScores;
    }

    /**
     * A question requires some text and a point value.
     *
     * @param text  The question text.
     * @param points The point value of the question.
     */
    public Question(String text, int points) {
        setText(text);
        setPoints(points);
        scores = new int[0];
    }

    /**
     * Adds a student score to this question.
     * @param score the score to add.
     */
    public void add(int score) {

        // do not accept invalid scores
        if (score == NO_SCORE) {
            return;
        }

        //first case this is the first score being added
        if (scores.length == 0) {

        } else {
            //make a new array that's big enough, copy the old one to the new one, then add the score.
        }

        //TODO implement this with an array.
    }

    /**
     * Returns the highest score on this question of the exam.
     *
     * @return the getMaxScore score.
     */
    public int getMaxScore() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }


    /**
     * Returns the lowest score on this question of the exam.
     *
     * @return the getMinScore score.
     */
    public int getMinScore() {
        int min = Integer.MAX_VALUE;

        //TODO implement this

        return min;
    }

    /**
     * Returns the getScoreAverage score on this exam question.
     *
     * @return the getScoreAverage score.
     */
    public double getScoreAverage() {
        double average = 0.0;
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        if (scores.length > 0) {
            average = (double) total / scores.length;
        }

        return average;
    }

    /**
     * Returns the getMedianScore score of this question.
     *
     * @return the getMedianScore score.
     */
    public int getMedianScore() {

        // With an array, you could sort it then find the middle of the array.
        // easy peasy.

        return -1;
    }

    public String toString() {
        String buffer = "";

        buffer += "(" + getPoints() + "pts.) " + getText() + "\n";
        buffer += "MIN: " + getMinScore() + "\n";
        buffer += "MAX: " + getMaxScore() + "\n";
        buffer += "AVG: " + getScoreAverage() + "\n";
        buffer += "MED: " + getMedianScore() + "\n";
        buffer += "TOTAL: " + getScoreCount() + "\n";

        return buffer;
    }

}
