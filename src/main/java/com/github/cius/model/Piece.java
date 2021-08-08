package com.github.cius.model;

public class Piece {
    public String type;
    public String color;

    public Piece(String color) {
        this.color = color;
        this.type = "";
    }

    public boolean isValidMovement(Position start, Position end) {
        return false;
    }

    public boolean isHorizontal(Position start, Position end) {
        return start.row == end.row;
    }

    public boolean isVertical(Position start, Position end) {
        return start.col == end.col;
    }

    public boolean isDiagonal(Position start, Position end) {
        return distance(start, end, 0) == distance(start, end, 1);
    }

    public boolean isForward(Position start, Position end) {
        return distance(start, end, 1) > 0;
    }

    public boolean isCapturing(Position end) {
        return end.isOccupied();
    }

    public int distance(Position start, Position end, int type) {
        if(type == 0) {
            return end.col - start.col;
        }else if(type == 1) {
            return end.row - start.row;
        }else {
            return 0;
        }
    }

    public String toString() {
        return color + type;
    }
}