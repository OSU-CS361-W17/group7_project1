package edu.oregonstate.cs361.battleship;

class Coords {
    private int Across;
    private int Down;

    Coords() {
        this(0, 0);
    }

    Coords(int across, int down) {
        setAcross(across);
        setDown(down);
    }

    int getAcross() {
        return Across;
    }

    int getDown() {
        return Down;
    }

    void setAcross(int across) {
        if (across >= 0)
            Across = across;
        else
            Across = 0;
    }

    void setDown(int down) {
        if (down >= 0)
            Down = down;
        else
            Down = 0;
    }
}
