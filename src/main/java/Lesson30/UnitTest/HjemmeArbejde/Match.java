package Lesson30.UnitTest.HjemmeArbejde;

import java.util.*;

public class Match {


    // 🔹 Attributter (private = encapsulation)
    private String teamA;
    private String teamB;
    private int scoreA;
    private int scoreB;

    // 🔹 Constructor
    public Match(String teamA, String teamB, int scoreA, int scoreB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    // 🔹 Getters
    public String getTeamA() {
        return teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public int getScoreA() {
        return scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    // 🔹 Metode: Find vinder af kampen
    public String getWinner() {

        // Hvis hold A scorer flest mål
        if (scoreA > scoreB) {
            return teamA;

            // Hvis hold B scorer flest mål
        } else if (scoreB > scoreA) {
            return teamB;

            // Hvis uafgjort
        } else {
            return "Draw";
        }
    }

    // 🔹 Beregn scoreforskel (absolut værdi)
    public int getScoreDifference() {
        return Math.abs(scoreA - scoreB);
    }

    // 🔹 Find kamp med størst scoreforskel
    public static Match findBiggestWin(List<Match> matches) {

        // Edge case: tom liste
        if (matches == null || matches.isEmpty()) {
            return null;
        }

        Match biggest = matches.get(0);

        for (Match m : matches) {
            if (m.getScoreDifference() > biggest.getScoreDifference()) {
                biggest = m;
            }
        }

        return biggest;
    }

    // 🔹 Sortér liste efter scoreforskel (størst først)
    public static void sortByScoreDifference(List<Match> matches) {

        // Collections.sort med lambda
        Collections.sort(matches, (m1, m2) ->
                m2.getScoreDifference() - m1.getScoreDifference()
        );
    }

    // 🔹 toString (god til debugging)
    @Override
    public String toString() {
        return teamA + " " + scoreA + " - " + scoreB + " " + teamB;
    }
}