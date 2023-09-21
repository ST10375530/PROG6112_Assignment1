/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10375530_SectionB;

/**
 *
 * @author lab_services_student
 */
public class Games extends Players{

    public Games(String playerName, int jerseyNumber, int pointsScored, int gamesPlayed) {
        super(playerName, jerseyNumber, pointsScored);
    }
    
    
    public void calculateScore() {
        int fieldGoals = (int) (Math.random() * 20) + 10; // Simulating field goals attempted
        int threePointers = (int) (Math.random() * fieldGoals); // Simulating three-pointers made

        int points = (2 * (fieldGoals - threePointers)) + (3 * threePointers); // Calculate total points
        scoredPoints(points);
    }
    
    
}
