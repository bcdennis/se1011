/*
 * SE1011
 * Fall 2018
 * Exam app
 * Name: Brad Dennis
 * Created: 10/30/2018
 */
package edu.msoe.exams;

/**
 * A set of unit tests for our Exam and Question classes.
 *
 * @author bdennis
 * @version 2016.10.30
 */


public class AppTests {

    private static final String PASSED = "passed";
    private static final String FAILED = "FAILED";

    public static void main(String[] args) {
        doExamTests();
        doQuestionTests();
    }

    private static void doQuestionTests() {
        testQuestionConstructor();
        testAddingScores();
        testAddingInvalidScores();
        testQuestionStats();
    }

    private static void testQuestionConstructor() {
        Question test = new Question("Test Text", 15);

        System.out.println("Question Constructor Tests:");
        String name = "Text parameter";
        String result = FAILED;

        if (test.getText().equals("Test Text")) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        name = "Point parameter";
        result = FAILED;


        if (test.getPoints() == 15) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);
    }

    private static void testAddingScores() {
        Question test = new Question ("Test text", 15);

        System.out.println("Question Adding Scores Tests:");
        String name = "Adding 0 scores";
        String result = FAILED;

        if (test.getNumberOfScores() == 0) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        name = "Adding 1 score";
        result = FAILED;

        test.add(10);

        if (test.getNumberOfScores() == 1) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Question ("Test text", 15);
        name = "Adding 2 scores";
        result = FAILED;

        test.add(10);
        test.add(11);

        if (test.getNumberOfScores() == 2) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Question ("Test text", 15);
        name = "Adding 10 scores";
        result = FAILED;

        test.add(10);
        test.add(11);
        test.add(20);
        test.add(30);
        test.add(15);
        test.add(50);
        test.add(14);
        test.add(25);
        test.add(32);
        test.add(11);

        if (test.getNumberOfScores() == 10) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Question ("Test text", 15);
        name = "Adding 19 scores";
        result = FAILED;

        test.add(10);
        test.add(11);
        test.add(20);
        test.add(30);
        test.add(15);
        test.add(50);
        test.add(14);
        test.add(25);
        test.add(32);
        test.add(11);
        test.add(10);
        test.add(11);
        test.add(20);
        test.add(30);
        test.add(15);
        test.add(50);
        test.add(14);
        test.add(25);
        test.add(32);

        if (test.getNumberOfScores() == 19) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Question ("Test text", 15);
        name = "Adding 20 scores";
        result = FAILED;

        test.add(10);
        test.add(11);
        test.add(20);
        test.add(30);
        test.add(15);
        test.add(50);
        test.add(14);
        test.add(25);
        test.add(32);
        test.add(11);
        test.add(10);
        test.add(11);
        test.add(20);
        test.add(30);
        test.add(15);
        test.add(50);
        test.add(14);
        test.add(25);
        test.add(32);
        test.add(25);

        if (test.getNumberOfScores() == 20) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Question ("Test text", 15);
        name = "Adding 21 scores";
        result = FAILED;

        test.add(10);
        test.add(11);
        test.add(20);
        test.add(30);
        test.add(15);
        test.add(50);
        test.add(14);
        test.add(25);
        test.add(32);
        test.add(11);
        test.add(10);
        test.add(11);
        test.add(20);
        test.add(30);
        test.add(15);
        test.add(50);
        test.add(14);
        test.add(25);
        test.add(32);
        test.add(25);
        test.add(50);

        if (test.getNumberOfScores() == 20) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);
    }

    private static void testAddingInvalidScores() {
        Question test = new Question ("Test text", 15);

        System.out.println("Question Adding Invalid Score Tests:");
        String name = "Adding -1 as a score";
        String result = FAILED;

        test.add(-1);
        if (test.getNumberOfScores() == 0) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Question ("Test text", 15);
        name = "Adding 0 as a score";
        result = FAILED;

        test.add(0);
        if (test.getNumberOfScores() == 1) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Question ("Test text", 15);
        name = "Adding 1 as a score";
        result = FAILED;

        test.add(1);
        if (test.getNumberOfScores() == 1) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

    }

    private static void testQuestionStats() {
        Question test = new Question("Test Text", 15);

        System.out.println("Question Stat Tests:");
        String name = "Max";
        String result = FAILED;

        test.add(0);
        test.add(10);
        test.add(50);

        if (test.getMaxScore() == 50) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Question("Test Text", 15);
        name = "Min";
        result = FAILED;

        test.add(0);
        test.add(10);
        test.add(50);

        if (test.getMinScore() == 0) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Question("Test Text", 15);
        name = "Average";
        result = FAILED;

        test.add(0);
        test.add(10);
        test.add(50);

        if (test.getScoreAverage() == 20d) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Question("Test Text", 15);
        name = "Total";
        result = FAILED;

        test.add(0);
        test.add(10);
        test.add(50);

        if (test.getNumberOfScores() == 3) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);
    }

    private static void doExamTests() {
        testExamConstructor();
        testAddingQuestionsToExam();
        testAddingExamScores();
        testExamStats();
    }

    private static void testExamConstructor() {
        Exam test = new Exam("Test Exam");

        System.out.println("Exam Constructor Tests:");
        String name = "Single argument constructor";
        String result = FAILED;

        if (test.getName().equals("Test Exam") && test.getPoints() == 50) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam", 20);
        name = "Two argument constructor";
        result = FAILED;

        if (test.getName().equals("Test Exam") && test.getPoints() == 20) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);
    }

    private static void testAddingQuestionsToExam() {
        Exam test = new Exam("Test Exam");

        System.out.println("Adding Question Tests:");
        String name = "Adding no questions";
        String result = FAILED;

        if (test.getNumberOfQuestions() == 0) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam");
        name = "Adding one question";
        result = FAILED;

        test.add(new Question("question test", 10));

        if (test.getNumberOfQuestions() == 1) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam");
        name = "Adding two questions";
        result = FAILED;

        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));

        if (test.getNumberOfQuestions() == 2) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam");
        name = "Adding three questions";
        result = FAILED;

        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));

        if (test.getNumberOfQuestions() == 3) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam");
        name = "Adding four questions";
        result = FAILED;

        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));

        if (test.getNumberOfQuestions() == 4) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam");
        name = "Adding five questions";
        result = FAILED;

        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));

        if (test.getNumberOfQuestions() == 5) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam");
        name = "Adding six questions";
        result = FAILED;

        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));
        test.add(new Question("question test", 10));

        if (test.getNumberOfQuestions() == 5) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

    }

    private static void testAddingExamScores() {
        Exam test = new Exam("Test Exam");

        System.out.println("Adding Scores Tests:");
        String name = "Adding no scores";
        String result = FAILED;

        if (test.getNumberOfScores() == 0) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam", 20);
        name = "Adding one score.";
        result = FAILED;

        test.add(10, 10, 10, 10, 10);

        if (test.getNumberOfScores() == 1) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam", 20);
        name = "Adding two scores.";
        result = FAILED;

        test.add(10, 10, 10, 10, 10);
        test.add(20, 20, 20, 20, 20);

        if (test.getNumberOfScores() == 2) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);
    }

    private static void testExamStats() {
        Exam test = new Exam("Test Exam");

        System.out.println("Exam Stat Tests:");
        String name = "Max";
        String result = FAILED;

        test.add(0, 0, 0, 0, 0);
        test.add(10, 10, 10, 10, 10);
        test.add(50, 50, 50, 50, 50);

        if (test.getMaxScore() == 250) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam");
        name = "Min";
        result = FAILED;

        test.add(0, 0, 0, 0, 0);
        test.add(10, 10, 10, 10, 10);
        test.add(50, 50, 50, 50, 50);

        if (test.getMinScore() == 0) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam");
        name = "Average";
        result = FAILED;

        test.add(0, 0, 0, 0, 0);
        test.add(10, 10, 10, 10, 10);
        test.add(50, 50, 50, 50, 50);

        if (test.getScoreAverage() == 100d) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);

        test = new Exam("Test Exam");
        name = "Total";
        result = FAILED;

        test.add(0, 0, 0, 0, 0);
        test.add(10, 10, 10, 10, 10);
        test.add(50, 50, 50, 50, 50);

        if (test.getNumberOfScores() == 3) {
            result = PASSED;
        }

        System.out.println("Test -  " + name + " - " + result);
    }

}
