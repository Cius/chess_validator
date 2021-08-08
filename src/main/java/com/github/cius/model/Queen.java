package model;

public class Queen extends Piece {

    public Queen(String color) {
        super(color);
        type = "Q";
    }

    @Override
    public boolean isValidMovement(Position start, Position end) {
        return isDiagonal(start, end) || isHorizontal(start, end) || isVertical(start, end);
    }
}