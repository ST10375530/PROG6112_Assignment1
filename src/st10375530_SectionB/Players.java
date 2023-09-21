/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10375530_SectionB;

/**
 *
 * @author lab_services_student
 */
public class Players {
    private String playerName;
    private int jerseyNumber;
    private int pointsScored;
    private int gamesPlayed;

    public Players(String playerName, int jerseyNumber, int pointsScored) {
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.pointsScored = pointsScored;
        this.gamesPlayed = 0;
    }

    public void scoredPoints(int points) {
        this.pointsScored += points;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public void playGame() {
        gamesPlayed++;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    @Override
    public String toString() {
        return "Players{" + "playerName=" + playerName + ", jerseyNumber=" + jerseyNumber + ", pointsScored=" + pointsScored + ", gamesPlayed=" + gamesPlayed + '}';
    }

      
    
    
}
