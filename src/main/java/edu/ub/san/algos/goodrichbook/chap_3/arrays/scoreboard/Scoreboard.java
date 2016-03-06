package edu.ub.san.algos.goodrichbook.chap_3.arrays.scoreboard;

/**
 * Created by san on 3/1/16 for algos.
 */
public class Scoreboard {
    private GameEntry[] board;
    private int numOfEntries;

    public Scoreboard(int size) {
        this.board = new GameEntry[size];
    }

    public void addEntry(GameEntry e) {
        if (numOfEntries < board.length || e.getScore() > board[numOfEntries - 1].getScore()) {
            if (numOfEntries < board.length)
                numOfEntries++;

            int j = numOfEntries - 1;
            while (j > 0 && board[j-1].getScore() < e.getScore()) {
                board [j] = board [j-1];
                j--;
            }
            board[j] = e;
        }
    }

    public GameEntry deleteEntry(int index) {
        GameEntry out = board [index];
        for (int j = index; j < numOfEntries - 1; j++)
            board[j] = board[j+1];
        board [numOfEntries - 1] = null;
        numOfEntries--;
        return out;
    }

    public GameEntry [] getBoard() {
        return this.board;
    }
}
