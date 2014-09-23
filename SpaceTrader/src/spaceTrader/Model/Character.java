/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader.Model;

/**
 *Model for character ship
 * 
 */
public class Character {
    private String userName = "";
    private int pilotP, fighterP, traderP, engineerP;
    
    public Character() {
        pilotP = 0;
        fighterP = 0;
        traderP = 0;
        engineerP = 0;
    }
    
    public Character(String name, int pilotP, int fighterP, int traderP, int engineerP) {
        userName = name;
        this.pilotP = pilotP;
        this.fighterP = fighterP;
        this.traderP = traderP;
        this.engineerP = engineerP;
    }
    
    public String getName() {
        return userName;
    }
    
    public int getPilotP() {
        return pilotP;
    }
    
    public int getFighterP() {
        return fighterP;
    }
    
    public int getTraderP() {
        return traderP;
    }
    
    public int getEngineerP() {
        return engineerP;
    }
    
}
