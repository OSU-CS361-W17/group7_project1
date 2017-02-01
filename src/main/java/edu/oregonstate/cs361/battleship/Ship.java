package edu.oregonstate.cs361.battleship;

class Ship {

    private String name;
    private int length;
    private Coords start;
    private Coords end;

    Ship(String name, int length) {
        // If no coordinates specified, default to (0,0) (which is off-grid)
        this(name, length, new Coords(0,0), new Coords(0,0));
    }

    Ship(String name, int length, Coords start, Coords end) {
        this.name = name;

        if (length >= 1)
            this.length = length;
        else
            this.length = 1;

        this.start = start;
        this.end = end;
    }

    int getLength() { return length; }

    Coords getStart() { return start; }

    Coords getEnd() { return end; }
}