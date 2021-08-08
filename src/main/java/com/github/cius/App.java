package com.github.cius;

import com.github.cius.model.Board;

public class App {
    public static void main(String[] args) throws Exception {
        Board b = new Board();
        b.initBoard();
        System.out.println(b);

        String move = "e2 e4";
        b.movePiece(move);
        System.out.println(b);
    }
}
