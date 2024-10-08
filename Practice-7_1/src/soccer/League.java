/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Start of code that builds teams
        // Create team1      
        Player player1 = new Player();
        player1.playerName = "Gabriel Martinelli";
        Player player2 = new Player();
        player2.playerName = "Declan Rice";
        Player player3 = new Player();
        player3.playerName = "Aaron Ramsdale";
        Player[] thePlayers = {player1, player2, player3 };
        
        Team team1 = new Team();
        team1.teamName = "Arsenal";
        team1.playerArray = thePlayers;
        
        // Create team2
        Team team2 = new Team();
        team2.teamName = "Man City";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Kevin De Bruyne ";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Rodri";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Erling Haaland";
        
        // End of code that builds teams
        
    
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        System.out.println("Goal scored after " + 
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName);
        
        

        for (Player thePlayer: team2.playerArray) {
            //System.out.println(thePlayer.playerName);
            if (thePlayer.playerName.matches(".*Sab.*")) {
                System.out.println("Found " + thePlayer.playerName);
                System.out.println("Last name is " + thePlayer.playerName.split(" ")[1]);
            }
        }
        
        StringBuilder familyNameFirst = new StringBuilder();
        for (Player thePlayer: team1.playerArray) {
            String[] name = thePlayer.playerName.split(" ");
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            familyNameFirst.delete(0,familyNameFirst.length());
            
        } 
    }   
}
