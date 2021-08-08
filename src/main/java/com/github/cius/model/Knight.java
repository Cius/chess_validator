package com.github.cius.model;

public class Knight extends Piece {

    public Knight(String color) {
        super(color);
        type = "N";
    }

    @Override
    public boolean isValidMovement(Position start, Position end) {
        return (Math.abs(distance(start, end, 0)) == 2 && Math.abs(distance(start, end, 1)) == 1)
            || (Math.abs(distance(start, end, 0)) == 1 && Math.abs(distance(start, end, 1)) == 2);
    }
}