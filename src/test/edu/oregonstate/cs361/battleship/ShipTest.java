package edu.oregonstate.cs361.battleship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    @Test
    public void testShip() {
        Ship ship = new Ship("Test Ship", 3);

        // No specified coordinates should start ship in 0,0 (off-grid)
        assertEquals(0, ship.getStart().getAcross());
        assertEquals(0, ship.getStart().getDown());
        assertEquals(0, ship.getEnd().getAcross());
        assertEquals(0, ship.getEnd().getDown());
    }

    @Test
    public void testNegativeLength() {
        Ship ship = new Ship("Negative Length Ship", -4);

        // Negative length values should replaced with a positive value
        assertTrue(ship.getLength() >= 1);
    }
}