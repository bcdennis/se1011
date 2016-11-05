package edu.msoe.arrays;

import static org.junit.Assert.*;

/**
 * This class tests our ScoreList class.
 * The default size of this list is 10, but it will grow automatically.
 *
 * @author bdennis
 * @version 2016.10.30
 */
public class ScoreListTest {

    private ScoreList list;

    @org.junit.Before
    public void setUp() throws Exception {
        list = new ScoreList();
    }

    @org.junit.Test
    public void testAddIncrementsSize() throws Exception {
        list.add(100);
        assertEquals(1, list.size());
    }

    @org.junit.Test
    public void testAddContainsNewScore() throws Exception {
        list.add(100);
        assertTrue(list.contains(100));
    }

    @org.junit.Test
    public void testAddInsertsNewScoreInCorrectIndex() throws Exception {
        list.add(100);
        list.add(95);
        list.add(90);

        list.add(1,98);
        assertEquals(98, list.get(1));
    }

    @org.junit.Test
    public void testInsertIncrementsSize() throws Exception {
        list.add(100);
        list.add(95);
        list.add(90);

        list.add(1,98);

        assertEquals(4, list.size());
    }

    @org.junit.Test
    public void testAddPutScoreInCorrectIndex() throws Exception {
        list.add(100);
        assertEquals(100, list.get(0));
    }

    @org.junit.Test
    public void testIndexOfReturnsNegativeOneIfDoesntExist() throws Exception {
        list.add(100);
        assertEquals(-1, list.indexOf(90));
    }


    @org.junit.Test
    public void testIndexOfReturnsCorrectIndex() throws Exception {
        list.add(100);
        assertEquals(0, list.indexOf(100));
    }

    @org.junit.Test
    public void testRemoveNonExistentScoreDoesntError() throws Exception {
        list.add(100);
        list.remove(90);
        assertEquals(1, list.size());
    }

    @org.junit.Test
    public void testSetOnInvalidIndexReturnsNegativeOne() throws Exception {
        list.add(100);
        assertEquals(-1, list.set(2, 90));
    }

    @org.junit.Test
    public void testSetOnValidIndexReturnsPreviousScore() throws Exception {
        list.add(100);
        list.add(90);
        list.add(85);
        list.add(80);
        assertEquals(85, list.set(2, 10));
    }

    @org.junit.Test
    public void testGetInvalidIndexNonEmptyListReturnsNegativeOne() throws Exception {
        list.add(100);
        assertEquals(-1, list.get(1));
    }

    @org.junit.Test
    public void testGetInvalidIndexEmptyListReturnsNegativeOne() throws Exception {
        assertEquals(-1, list.get(1));
    }

    @org.junit.Test
    public void testRemoveRemovesValueFromFront() throws Exception {
        list.add(100);
        list.add(90);
        list.add(80);

        list.remove(100);
        assertEquals(90, list.get(0));
    }

    @org.junit.Test
    public void testRemoveReducesSize() throws Exception {
        list.add(100);
        list.add(90);
        list.add(80);

        list.remove(100);
        assertEquals(2, list.size());
    }

    @org.junit.Test
    public void testRemoveRemovesFromMiddle() throws Exception {
        list.add(100);
        list.add(90);
        list.add(80);

        list.remove(90);
        assertEquals(80, list.get(1));
    }

    @org.junit.Test
    public void testClearClearsEmptyListWithoutError() throws Exception {
        list.clear();
        assertEquals(0, list.size());
    }

    @org.junit.Test
    public void testClearClearsNonEmptyList() throws Exception {
        list.add(100);
        list.add(90);
        list.clear();
        assertEquals(0, list.size());
    }
    @org.junit.Test
    public void testContainsReturnsTrueWhenValueExists() throws Exception {
        list.add(100);
        list.add(90);
        list.add(80);
        assertTrue(list.contains(90));
    }

    @org.junit.Test
    public void testContainsReturnsFalseWhenValueDoesNotExist() throws Exception {
        list.add(100);
        list.add(90);
        list.add(80);
        assertFalse(list.contains(75));
    }
    @org.junit.Test
    public void testSizeIsZeroWhenCreated() throws Exception {
        assertEquals(0, list.size());
    }

    @org.junit.Test
    public void testSizeIsOneWhenOneAdded() throws Exception {
        list.add(100);
        assertEquals(1, list.size());
    }


    @org.junit.Test
    public void testSizeIsNineWhenNineAdded() throws Exception {
        list.add(100);
        list.add(99);
        list.add(98);
        list.add(97);
        list.add(96);
        list.add(95);
        list.add(94);
        list.add(93);
        list.add(92);
        assertEquals(9, list.size());
    }

    @org.junit.Test
    public void testSizeIsTenWhenTenAdded() throws Exception {
        list.add(100);
        list.add(99);
        list.add(98);
        list.add(97);
        list.add(96);
        list.add(95);
        list.add(94);
        list.add(93);
        list.add(92);
        list.add(91);
        assertEquals(10, list.size());
    }

    @org.junit.Test
    public void testSizeIsElevenWhenElevenAdded() throws Exception {
        list.add(100);
        list.add(99);
        list.add(98);
        list.add(97);
        list.add(96);
        list.add(95);
        list.add(94);
        list.add(93);
        list.add(92);
        list.add(91);
        list.add(90);
        assertEquals(11, list.size());
    }

    @org.junit.Test
    public void testIsEmptyWhenCreated() throws Exception {
        assertTrue(list.isEmpty());
    }


    @org.junit.Test
    public void testIsNotEmptyWhenHasScores() throws Exception {
        list.add(10);
        assertFalse(list.isEmpty());
    }

}