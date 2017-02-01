package edu.oregonstate.cs361.battleship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordsTest {

    @Test
    void testCoords() {
        Coords coords1 = new Coords();
        // Should default to position 0,0 (off-grid)
        assertEquals(0, coords1.getDown());
        assertEquals(0, coords1.getAcross());

        Coords coords2 = new Coords(4, 1);
        assertEquals(4, coords2.getAcross());
        assertEquals(1, coords2.getDown());
    }

    @Test
    void testSetters() {
        Coords coords = new Coords();

        coords.setAcross(2);
        assertEquals(2, coords.getAcross());
        coords.setDown(1);
        assertEquals(1, coords.getDown());
    }

    @Test
    void testNegatives() {
        Coords coords = new Coords(-4, -2);
        assertTrue(coords.getAcross() >= 0);
        assertTrue(coords.getDown() >= 0);

        coords.setAcross(-3);
        coords.setDown(-1);
        assertTrue(coords.getAcross() >= 0);
        assertTrue(coords.getDown() >= 0);
    }
}