package edu.ub.san.algos.goodrichbook.chap_3.arrays.scoreboard;

/**
 * Created by san on 3/1/16 for algos.
 */
public class GameEntry {
    private String name;
    private int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameEntry gameEntry = (GameEntry) o;

        if (getScore() != gameEntry.getScore()) return false;
        return getName().equals(gameEntry.getName());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getScore();
        return result;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                       "name='" + name + '\'' +
                       ", score=" + score +
                       '}';
    }
}
