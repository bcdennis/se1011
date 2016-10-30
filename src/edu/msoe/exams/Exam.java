/*
 * SE1011
 * Fall 2018
 * Exam.java
 * Name: Brad Dennis
 * Created: 10/30/2018
 */
package edu.msoe.exams;

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

    private String name;
    private int points;
    private Question question1;
    private Question question2;
    private Question question3;
    private Question question4;
    private Question question5;

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
    private int numberOfScores;

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    /**
     * Calculates the number of questions an exam has.
     *
     * @return the getScoreCount of exam questions.
     */
    public int getNumberOfQuestions() {
        //TODO implement this.

        return 0;
    }

    public int getNumberOfScores() {
        return numberOfScores;
    }

    /**
     * Returns true of the number of question points is equal to the expected exam points.
     *
     * @return True if the exam is a valid exam.
     */
    public boolean isExamValid() {
        //TODO implement this.

        return false;
    }

    /**
     * An SE1011 exam requires a name at a minimum.  Points will default to 50.
     *
     * @param name the name of the exam
     */
    public Exam(String name) {
        this.name = name;
        points = DEFAULT_POINTS;
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
        if (student1Score == NO_SCORE) {
            student1Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student2Score == NO_SCORE) {
            student2Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student3Score == NO_SCORE) {
            student3Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student4Score == NO_SCORE) {
            student4Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student5Score == NO_SCORE) {
            student5Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student6Score == NO_SCORE) {
            student6Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student7Score == NO_SCORE) {
            student7Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student8Score == NO_SCORE) {
            student8Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student9Score == NO_SCORE) {
            student9Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student10Score == NO_SCORE) {
            student10Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student11Score == NO_SCORE) {
            student11Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student12Score == NO_SCORE) {
            student12Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student13Score == NO_SCORE) {
            student13Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student14Score == NO_SCORE) {
            student14Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student15Score == NO_SCORE) {
            student15Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student16Score == NO_SCORE) {
            student16Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student17Score == NO_SCORE) {
            student17Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student18Score == NO_SCORE) {
            student18Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student19Score == NO_SCORE) {
            student19Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        } else if (student20Score == NO_SCORE) {
            student20Score = sumScores(question1Score, question2Score, question3Score, question4Score, question5Score);
            numberOfScores++;
        }

        addQuestionScores(question1Score, question2Score, question3Score, question4Score, question5Score);
    }


    /**
     * Adds a question to the exam.
     *
     * @param question The question to add.
     */
    public void add(Question question) {
        if(question1 == null) {
            question1 = question;
        } else if (question2 == null) {
            question2 = question;
        } else if (question3 == null) {
            question3 = question;
        } else if (question4 == null) {
            question4 = question;
        } else if (question5 == null) {
            question5 = question;
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

        if (student1Score < min) {
            min = student1Score;
        }

        if (student2Score < min) {
            min = student2Score;
        }

        if (student3Score < min) {
            min = student3Score;
        }

        if (student4Score < min) {
            min = student4Score;
        }

        if (student5Score < min) {
            min = student5Score;
        }

        if (student6Score < min) {
            min = student6Score;
        }

        if (student7Score < min) {
            min = student7Score;
        }

        if (student8Score < min) {
            min = student8Score;
        }

        if (student9Score < min) {
            min = student9Score;
        }

        if (student10Score < min) {
            min = student10Score;
        }

        if (student11Score < min) {
            min = student11Score;
        }

        if (student12Score < min) {
            min = student12Score;
        }

        if (student13Score < min) {
            min = student13Score;
        }

        if (student14Score < min) {
            min = student14Score;
        }

        if (student15Score < min) {
            min = student15Score;
        }

        if (student16Score < min) {
            min = student16Score;
        }

        if (student17Score < min) {
            min = student17Score;
        }

        if (student18Score < min) {
            min = student18Score;
        }

        if (student19Score < min) {
            min = student19Score;
        }

        if (student20Score < min) {
            min = student20Score;
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

        if (student3Score > NO_SCORE) {
            total += student3Score;
            counter++;
        }

        if (student4Score > NO_SCORE) {
            total += student4Score;
            counter++;
        }

        if (student5Score > NO_SCORE) {
            total += student5Score;
            counter++;
        }

        if (student6Score > NO_SCORE) {
            total += student6Score;
            counter++;
        }

        if (student8Score > NO_SCORE) {
            total += student8Score;
            counter++;
        }

        if (student9Score > NO_SCORE) {
            total += student9Score;
            counter++;
        }

        if (student10Score > NO_SCORE) {
            total += student10Score;
            counter++;
        }

        if (student11Score > NO_SCORE) {
            total += student11Score;
            counter++;
        }

        if (student12Score > NO_SCORE) {
            total += student12Score;
            counter++;
        }

        if (student13Score > NO_SCORE) {
            total += student13Score;
            counter++;
        }

        if (student14Score > NO_SCORE) {
            total += student14Score;
            counter++;
        }

        if (student15Score > NO_SCORE) {
            total += student15Score;
            counter++;
        }

        if (student16Score > NO_SCORE) {
            total += student16Score;
            counter++;
        }

        if (student17Score > NO_SCORE) {
            total += student17Score;
            counter++;
        }

        if (student18Score > NO_SCORE) {
            total += student18Score;
            counter++;
        }

        if (student19Score > NO_SCORE) {
            total += student19Score;
            counter++;
        }

        if (student20Score > NO_SCORE) {
            total += student20Score;
            counter++;
        }

        if (counter > 0) {
            average = (double) total / counter;
        }

        return average;
    }

    private int sumScores(int question1Score, int question2Score, int question3Score, int question4Score, int question5Score) {
        int sum = 0;
        if (question1Score > -1) {
            sum += question1Score;
        }
        if (question2Score > -1) {
            sum += question2Score;
        }
        if (question3Score > -1) {
            sum += question3Score;
        }
        if (question4Score > -1) {
            sum += question4Score;
        }
        if (question5Score > -1) {
            sum += question5Score;
        }
        return sum;
    }

    private void addQuestionScores(int question1Score, int question2Score, int question3Score, int question4Score, int question5Score) {
        if (question1 != null && question1Score != NO_SCORE) {
            question1.add(question1Score);
        }
        if (question1 != null && question1Score != NO_SCORE) {
            question2.add(question2Score);
        }
        if (question1 != null && question1Score != NO_SCORE) {
            question3.add(question3Score);
        }
        if (question1 != null && question1Score != NO_SCORE) {
            question4.add(question4Score);
        }
        if (question1 != null && question1Score != NO_SCORE) {
            question5.add(question5Score);
        }
    }
}
