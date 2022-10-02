package application;

import boardlayer.Board;
import boardlayer.Position;
import chesslayer.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
