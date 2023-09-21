/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ST10375530_SectionB;

/**
 *
 * @author lab_services_student
 */
/*import st10375530_SectionB.Basketball;
import st10375530_SectionB.Players;
import st10375530_SectionB.Games;
import org.junit.Test;
import static org.junit.Assert.*;

public class BasketballTest {
    @Test
    public void testPlayerCreation() {
        Players player = new Players("Kobe", 23, 73);
        assertEquals("Test Player", player.getPlayerName());
        assertEquals(10, player.getJerseyNumber());
        assertEquals(0, player.getPointsScored());
    }

    @Test
    public void testGameSimulation() {
        Basketball player = new Basketball("Test Player", 10);
        Games games = new Games("Kobe", 23, 73, 8);
        games.calculateScore();
        assertTrue(games.getPointsScored() >= 50 && games.getPointsScored() <= 100);
    }
}*/

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class BasketballTest {

    @Test
    public void testBasketball() {
        String input = "Player1\n1\n20\n" +
                       "Player2\n2\n15\n" +
                       "Player3\n3\n25\n" +
                       "Player4\n4\n18\n" +
                       "Player5\n5\n22\n" +
                       "Player6\n6\n17\n" +
                       "Player7\n7\n19\n" +
                       "Player8\n8\n21\n" +
                       "Player9\n9\n16\n" +
                       "Player10\n10\n23\n";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Players[] players = new Players[10];
        for (int i = 0; i < 10; i++) {
            String playerName = "Player" + (i+1);
            int jerseyNo = i + 1;
            int pointsScored = i + 1;
            players[i] = new Players(playerName, jerseyNo, pointsScored);
            players[i].playGame();
            players[i].scoredPoints((int) (Math.random() * 20) + 10);
        }

        assertTrue(players[0].getGamesPlayed() == 1);
        assertEquals(20, players[0].getPointsScored());
        assertTrue(players[9].getGamesPlayed() == 1);
        assertEquals(23, players[9].getPointsScored());
    }
}

