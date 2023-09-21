/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10375530_SectionB;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class Basketball {

    public Basketball(String test_Player, int par) {
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Players[] players = new Players[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Player " + (i+1) + ":");
            System.out.println("Please enter Player's name: ");
            String playerName = input.next();
            
            System.out.println("Please enter the players jersey number: ");
            int jerseyNo = input.nextInt();
            
            System.out.println("Please enter the amount of points scored by the player: ");
            int pointsScored = input.nextInt();
            
            players[i] = new Players(playerName, jerseyNo, pointsScored);
        
            players[i].playGame(); // Increment games played
            players[i].scoredPoints((int) (Math.random() * 20) + 10);
        }

        for (Players player : players) {
            System.out.println(player.toString());
        }
    }
}
