package model;

public class Bishop extends Piece {
    public Bishop(String color) {
        super(color);
        type = "B";
    }

    @Override
    public boolean isValidMovement(Position start, Position end) {
        return isDiagonal(start, end);
    }
}