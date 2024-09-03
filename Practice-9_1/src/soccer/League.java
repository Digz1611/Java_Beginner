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
        
        League theLeague = new League();

        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);

        Game currGame = theGames[0];
        
        currGame.playGame();
        
        System.out.println(currGame.getDescription());

    }

    public Team[] createTeams() {

        Player player1 = new Player();
        player1.setPlayerName("Gabriel Martinelli");
        Player player2 = new Player();
        player2.setPlayerName("Declan Rice");
        Player player3 = new Player();
        player3.setPlayerName("Aaron Ramsdale");
        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.setTeamName("Arsenal");
        team1.setPlayerArray(thePlayers);

        // Create team2
        Team team2 = new Team();
        team2.setTeamName("Man City");
        team2.setPlayerArray(new Player[3]);
        team2.getPlayerArray()[0] = new Player();
        team2.getPlayerArray()[0].setPlayerName("Kevin De Bruyne");
        team2.getPlayerArray()[1] = new Player();
        team2.getPlayerArray()[1].setPlayerName("Rodri");
        team2.getPlayerArray()[2] = new Player();
        team2.getPlayerArray()[2].setPlayerName("Erling Haaland");

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        Game theGame = new Game();
        theGame.setHomeTeam(theTeams[0]);
        theGame.setAwayTeam(theTeams[1]);
        Game[] theGames = {theGame};
        return theGames;
    }

}
