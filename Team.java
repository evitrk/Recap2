/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recap;

import java.util.List;


public class Team {
    
    private String sport;
    private List<PersonD> players;

    public Team(String sport, List<PersonD> players) {
        this.sport = sport;
        this.players = players;
    }

    public Team() {
    }

    public String getSport() {
        return sport;
    }

    public List<PersonD> getPlayers() {
        return players;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setPlayers(List<PersonD> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" + "sport=" + sport + ", players=" + players + '}';
    }

    public Team(String sport) {
        this.sport = sport;
    }
    
    public void addPlayer(PersonD p){
    
        players.add(p);
    
    }
    
    
    
    
}
