package edu.oregonstate.cs361.battleship;

import static edu.oregonstate.cs361.battleship.Main.GRID_SIZE;

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

        if (length >= 1 && length <= GRID_SIZE)
            this.length = length;
        else
            this.length = 1;

        this.start = start;
        this.end = end;
    }

    int getLength() { return length; }

    Coords getStart() { return start; }

    Coords getEnd() { return end; }

    public void updatePosition(int row, int column, String orientation) {
        if (row <= 0 || row > GRID_SIZE || column <= 0 || column > GRID_SIZE)
            return;

        Coords start = getStart();
        Coords end = getEnd();

        if (orientation.equals("horizontal") && column + getLength() <= GRID_SIZE) {
            end.setAcross(column + getLength());
            end.setDown(row);
        }
        else if (orientation.equals("vertical") && row + getLength() <= GRID_SIZE) {
            end.setAcross(column);
            end.setDown(row + getLength());
        }
        else {
            return;
        }

        start.setDown(row);
        start.setAcross(column);
    }
}