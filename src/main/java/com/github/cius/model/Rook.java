package model;

public class Rook extends Piece {

    public Rook(String color) {
        super(color);
        type = "R";
    }

    @Override
    public boolean isValidMovement(Position start, Position end) {
        return isHorizontal(start, end) || isVertical(start, end);
    }
}