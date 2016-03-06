package edu.ub.san.algos.goodrichbook.chap_3.scoreboard;

import edu.ub.san.algos.goodrichbook.chap_3.arrays.scoreboard.GameEntry;
import edu.ub.san.algos.goodrichbook.chap_3.arrays.scoreboard.Scoreboard;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by san on 3/1/16 for algos.
 */
public class ScoreboardTest {

    public static void testData() {

    }

    @Test
    public void testAddEntry_OneEntryAdd() {
        int boardSize = 10;
        GameEntry entry = new GameEntry("Alonso", 20);
        Scoreboard scoreboard = new Scoreboard(boardSize);
        GameEntry [] expected = new GameEntry[boardSize];
        expected [0] = entry;

        scoreboard.addEntry(entry);

        assertArrayEquals(expected, scoreboard.getBoard());

    }
}
