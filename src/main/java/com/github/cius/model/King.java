package model;

public class King extends Piece {

    public King(String color) {
        super(color);
        type = "K";
    }

    @Override
    public boolean isValidMovement(Position start, Position end) {
        return Math.abs(distance(start, end, 0)) <= 1 && Math.abs(distance(start, end, 1)) <= 1;
    }
}