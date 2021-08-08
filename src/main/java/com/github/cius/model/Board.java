package com.github.cius.model;

public class Board {
    public int size = 8;
    public Position[] pos;
    public String curTurn = "W";

    public Board() {
        pos = new Position[size*size];

        for(int i = 0; i < size*size; i++) {
            pos[i] = new Position(i);
        }
    }

    public void initBoard() {
        String clr = "W";
        
        Rook wR = new Rook(clr);
        pos[0].occupiedBy = wR;
        Knight wN = new Knight(clr);
        pos[1].occupiedBy = wN;
        Bishop wB = new Bishop(clr);
        pos[2].occupiedBy = wB;
        Queen wQ = new Queen(clr);
        pos[3].occupiedBy = wQ;
        King wK = new King(clr);
        pos[4].occupiedBy = wK;
        Bishop wB1 = new Bishop(clr);
        pos[5].occupiedBy = wB1;
        Knight wN1 = new Knight(clr);
        pos[6].occupiedBy = wN1;
        Rook wR1 = new Rook(clr);
        pos[7].occupiedBy = wR1;

        Pawn wP = new Pawn(clr);
        pos[8].occupiedBy = wP;
        Pawn wP1 = new Pawn(clr);
        pos[9].occupiedBy = wP1;
        Pawn wP2 = new Pawn(clr);
        pos[10].occupiedBy = wP2;
        Pawn wP3 = new Pawn(clr);
        pos[11].occupiedBy = wP3;
        Pawn wP4 = new Pawn(clr);
        pos[12].occupiedBy = wP4;
        Pawn wP5 = new Pawn(clr);
        pos[13].occupiedBy = wP5;
        Pawn wP6 = new Pawn(clr);
        pos[14].occupiedBy = wP6;
        Pawn wP7 = new Pawn(clr);
        pos[15].occupiedBy = wP7;

        clr = "B";
        Pawn bP = new Pawn(clr);
        pos[48].occupiedBy = bP;
        Pawn bP1 = new Pawn(clr);
        pos[49].occupiedBy = bP1;
        Pawn bP2 = new Pawn(clr);
        pos[50].occupiedBy = bP2;
        Pawn bP3 = new Pawn(clr);
        pos[51].occupiedBy = bP3;
        Pawn bP4 = new Pawn(clr);
        pos[52].occupiedBy = bP4;
        Pawn bP5 = new Pawn(clr);
        pos[53].occupiedBy = bP5;
        Pawn bP6 = new Pawn(clr);
        pos[54].occupiedBy = bP6;
        Pawn bP7 = new Pawn(clr);
        pos[55].occupiedBy = bP7;

        Rook bR = new Rook(clr);
        pos[56].occupiedBy = bR;
        Knight bN = new Knight(clr);
        pos[57].occupiedBy = bN;
        Bishop bB = new Bishop(clr);
        pos[58].occupiedBy = bB;
        Queen bQ = new Queen(clr);
        pos[59].occupiedBy = bQ;
        King bK = new King(clr);
        pos[60].occupiedBy = bK;
        Bishop bB1 = new Bishop(clr);
        pos[61].occupiedBy = bB1;
        Knight bN1 = new Knight(clr);
        pos[62].occupiedBy = bN1;
        Rook bR1 = new Rook(clr);
        pos[63].occupiedBy = bR1;
    }

    public void movePiece(Position start, Position end) {
        System.out.println(start.col + " " + start.row);
        Position pStart = pos[size * (start.row - 1) + start.col];
        System.out.println(pStart.occupiedBy);
        Position pEnd = pos[size * (end.row - 1) + end.col];
        if(pStart.isOccupied() && pStart.occupiedBy.color == curTurn) {
            if(pStart.occupiedBy.isValidMovement(pStart, pEnd)) {
                pEnd.occupiedBy = pStart.occupiedBy;
                pStart.occupiedBy = null;

                endTurn();
            }
        }
    }

    public void movePiece(String movement) {
        String pos[] = movement.split(" ");
        Position st = new Position(pos[0]);
        Position en = new Position(pos[1]);

        movePiece(st, en);
    }

    public void endTurn() {
        curTurn = curTurn == "W" ? "B" : "W";
    }

    public String toString() {
        String res = "";
        for(int i = size - 1; i >= 0; i--) {
            for(int j = i * size; j < (i + 1) * size; j++) {
                res += pos[j] + " ";

                if ((j + 1) % size == 0) {
                    res += "\n";
                }
            }
        }

        return res;
    }
}