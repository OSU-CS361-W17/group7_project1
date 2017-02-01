package edu.oregonstate.cs361.battleship;

import java.util.ArrayList;

public class BattleshipModel {

    // Player's ships
    private Ship aircraftCarrier;
    private Ship battleship;
    private Ship cruiser;
    private Ship destroyer;
    private Ship submarine;

    // AI's ships
    private Ship computer_aircraftCarrier;
    private Ship computer_battleship;
    private Ship computer_cruiser;
    private Ship computer_destroyer;
    private Ship computer_submarine;

    // Shots fired
    private ArrayList<Coords> playerHits;
    private ArrayList<Coords> playerMisses;
    private ArrayList<Coords> computerHits;
    private ArrayList<Coords> computerMisses;

    public BattleshipModel() {
        aircraftCarrier = new Ship("AircraftCarrier", 5);
        battleship = new Ship("Battleship", 4);
        cruiser = new Ship("Cruiser", 3);
        destroyer = new Ship("Destroyer", 2);
        submarine = new Ship("Submarine", 2);

        computer_aircraftCarrier = new Ship("Computer_AircraftCarrier", 5);
        computer_battleship = new Ship("Computer_Battleship", 4);
        computer_cruiser = new Ship("Computer_Cruiser", 3);
        computer_destroyer = new Ship("Computer_Destroyer", 2);
        computer_submarine = new Ship("Computer_Submarine", 2);

        playerHits = new ArrayList<Coords>();
        playerMisses = new ArrayList<Coords>();
        computerHits = new ArrayList<Coords>();
        computerMisses = new ArrayList<Coords>();
    }
}
