package com.github.cius.model;

public class Position {
    public int col;
    public int row;
    public Piece occupiedBy;

    public Position(String pos) {
        col = pos.charAt(0) - 97;
        row = Integer.parseInt("" + pos.charAt(1));
    }

    public Position(int i) {
        col = (i % 8) + 1;
        row = (i / 8) + 1;
    }

    public boolean isOccupied() {
        return occupiedBy != null;
    }

    public String toString() {
        return isOccupied() ? occupiedBy.toString() : "--";
    }
}