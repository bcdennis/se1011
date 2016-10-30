/*
 * SE1011
 * Fall 2018
 * Question.java
 * Name: Brad Dennis
 * Created: 10/30/2018
 */
package edu.msoe.exams;

/**
 * This class models an SE1011 exam question.  There is a maximum of 20 students in a given SE1011 section.
 * Questions must have a non-negative value and non-empty text.
 *
 * @author bdennis
 * @version 2016.10.30
 */
public class Question {
    private String text = "Default question text.";
    private int points = 0;
    private static final int NO_SCORE = -1;

    private int student1Score = NO_SCORE;
    private int student2Score = NO_SCORE;
    private int student3Score = NO_SCORE;
    private int student4Score = NO_SCORE;
    private int student5Score = NO_SCORE;
    private int student6Score = NO_SCORE;
    private int student7Score = NO_SCORE;
    private int student8Score = NO_SCORE;
    private int student9Score = NO_SCORE;
    private int student10Score = NO_SCORE;
    private int student11Score = NO_SCORE;
    private int student12Score = NO_SCORE;
    private int student13Score = NO_SCORE;
    private int student14Score = NO_SCORE;
    private int student15Score = NO_SCORE;
    private int student16Score = NO_SCORE;
    private int student17Score = NO_SCORE;
    private int student18Score = NO_SCORE;
    private int student19Score = NO_SCORE;
    private int student20Score = NO_SCORE;
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

        if (student1Score == NO_SCORE) {
            student1Score = score;
            numberOfScores++;
        } else if (student2Score == NO_SCORE) {
            student2Score = score;
            numberOfScores++;
        }

        //TODO finish this
    }

    /**
     * Returns the highest score on this question of the exam.
     *
     * @return the getMaxScore score.
     */
    public int getMaxScore() {
        int max = Integer.MIN_VALUE;

        if (student1Score > max) {
            max = student1Score;
        }

        if (student2Score > max) {
            max = student2Score;
        }

        if (student3Score > max) {
            max = student3Score;
        }

        if (student4Score > max) {
            max = student4Score;
        }

        if (student5Score > max) {
            max = student5Score;
        }

        if (student6Score > max) {
            max = student6Score;
        }

        if (student7Score > max) {
            max = student7Score;
        }

        if (student8Score > max) {
            max = student8Score;
        }

        if (student9Score > max) {
            max = student9Score;
        }

        if (student10Score > max) {
            max = student10Score;
        }

        if (student11Score > max) {
            max = student11Score;
        }

        if (student12Score > max) {
            max = student12Score;
        }

        if (student13Score > max) {
            max = student13Score;
        }

        if (student14Score > max) {
            max = student14Score;
        }

        if (student15Score > max) {
            max = student15Score;
        }

        if (student16Score > max) {
            max = student16Score;
        }

        if (student17Score > max) {
            max = student17Score;
        }

        if (student18Score > max) {
            max = student18Score;
        }

        if (student19Score > max) {
            max = student19Score;
        }

        if (student20Score > max) {
            max = student20Score;
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
        int counter = 0;
        int total = 0;

        if (student1Score > NO_SCORE) {
            total += student1Score;
            counter++;
        }

        if (student2Score > NO_SCORE) {
            total += student2Score;
            counter++;
        }

        //TODO finish this

        if (counter > 0) {
            average = (double)total/counter;
        }

        return average;
    }

    /**
     * Returns the getMedianScore score of this question.
     *
     * @return the getMedianScore score.
     */
    public int getMedianScore() {

        //How would you do this?

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
