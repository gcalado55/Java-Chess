package Application;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;

public class Progam {

    public static void main(String[] args){


        ChessMatch chessMatch = new ChessMatch();
        Ui.printBoard(chessMatch.getPieces());

    }
}
