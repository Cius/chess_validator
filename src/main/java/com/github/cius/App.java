package com.github.cius;

public class App {
    public static void main(String[] args) throws Exception {
        Board b = new Board();
        b.initBoard();
        System.out.println(b);

        String move = "e2 e4";
        b.movePiece(movement);
        System.out.println(b);
    }
}
