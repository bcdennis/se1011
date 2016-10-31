/*
 * SE1011
 * Fall 2018
 * Exam.java
 * Name: Brad Dennis
 * Created: 10/30/2018
 */
package edu.msoe.arrays;

/**
 * This class models an SE1011 exam.  An SE1011 exam can have up to 5 questions.
 * There are a getMaxScore of 20 students in a SE1011 section.
 *
 * @author bdennis
 * @version 2016.10.30
 */
public class Exam {
    private static final int DEFAULT_POINTS = 50;
    private static final int NO_SCORE = -1;
    private static final int MAX_STUDENTS = 20;
    private static final int MAX_QUESTIONS = 5;

    private String name;
    private int points;

    private Question[] questions;
    private int[] scores;



    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    /**
     * Calculates the number of questions an exam has.
     *
     * @return the getNumberOfScores of exam questions.
     */
    public int getNumberOfQuestions() {
        return questions.length;
    }

    public int getNumberOfScores() {
        return scores.length;
    }

    /**
     * Returns true of the number of question points is equal to the expected exam points.
     *
     * @return True if the exam is a valid exam.
     */
    public boolean isExamValid() {
        int total = 0;
        for (int i = 0; i < questions.length; i++) {
            total += questions[i].getPoints();
        }

        return (getPoints() == total);
    }

    /**
     * An SE1011 exam requires a name at a minimum.  Points will default to 50.
     *
     * @param name the name of the exam
     */
    public Exam(String name) {
        this.name = name;
        points = DEFAULT_POINTS;
        questions = new Question[0];
        scores = new int[0];
    }

    /**
     * An overloaded constructor for when the instructor wants to have an exam be worth
     * more than 50 points.
     *
     * @param name   the name of the exam
     * @param points the point value of the exam.
     */
    public Exam(String name, int points) {
        this(name);
        this.points = points;
    }

    /**
     * Adds a students scores to the exam.  A -1 is used to signify the question wasn't part of the exam.
     *
     * @param question1Score the score for question 1
     * @param question2Score the score for question 2
     * @param question3Score the score for question 3
     * @param question4Score the score for question 4
     * @param question5Score the score for question 5
     */
    public void add(int question1Score, int question2Score, int question3Score, int question4Score, int question5Score) {
        add(new int[]{question1Score, question2Score, question3Score, question4Score, question5Score});
    }

    /**
     * Adds an array of student question scores to the exam.
     *
     * @param questionScores The array of question scores on the exam.
     */
    public void add(int[] questionScores) {

        // drop any extra scores
        if (scores.length > MAX_STUDENTS) {
            return;
        }

        int total = 0;

        for (int i = 0; i < questionScores.length; i++) {
            if (questionScores[i] != NO_SCORE) {
                total += questionScores[i];
                // error checking making sure I don't raise a null pointer exception.
                // this checks to make sure the question array is long enough and what's in there isn't null.
                if ((i < questions.length -1) && questions[i] != null) {
                    questions[i].add(scores[i]);
                }
            }
        }

        // first case.  array is empty.
        if (scores.length == 0) {
            //alternative syntax for initializing an array.
            scores = new int[] {total};
        } else {
            //make new array one size bigger, copy from old to new, add new element.
            int[] scoresCopy = new int[scores.length + 1];
            for(int i = 0; i < scores.length; i++) {
                scoresCopy[i] = scores[i];
            }

            scoresCopy[scores.length] = total;
            scores = scoresCopy;
        }
    }


    /**
     * Adds a question to the exam.  Ignores any above the limit of 5.
     *
     * @param question The question to add.
     */
    public void add(Question question) {
        // exception case.  array is full
        if (questions.length == MAX_QUESTIONS) {
            return;
        }

        // first case.  array is empty make new array
        if (questions.length == 0) {
            questions = new Question[1];
            questions[0] = question;
        } else {
            // make new array one size bigger, copy old to new then add the new item.
            // uses System.arraycopy instead of doing it manually.
            Question[] questionsCopy = new Question[questions.length +1];
            System.arraycopy(questions, 0, questionsCopy, 0, questions.length);

            questionsCopy[questions.length] = question;
            questions = questionsCopy;
        }
    }

    /**
     * Calculates the maximum score of the exam.
     *
     * @return the highest score on the exam.
     */
    public int getMaxScore() {
        int max = Integer.MIN_VALUE;

        //TODO implement this

        return max;
    }

    /**
     * Calculates the minimum score of the exam.
     *
     * @return the lowest score on the exam.
     */
    public int getMinScore() {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        return min;
    }

    /**
     * Returns the average score on this exam question.
     *
     * @return the average score.
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

    public String toString() {
        String buffer = "";

        buffer += getName() + " worth " + getPoints() + "pts.\n";
        buffer += "MIN: " + getMinScore() + "\n";
        buffer += "MAX: " + getMaxScore() + "\n";
        buffer += "AVG: " + getScoreAverage() + "\n";
        buffer += "TOTAL: " + getNumberOfScores() + "\n";

        return buffer;
    }

}
