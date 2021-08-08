package model;

public class Pawn extends Piece {

    public Pawn(String color) {
        super(color);
        type = "P";
    }

    @Override
    public boolean isValidMovement(Position start, Position end) {
        boolean res = isVertical(start, end) || (isDiagonal(start, end) && isCapturing(end));
        return res && isForward(start, end);
    }
}