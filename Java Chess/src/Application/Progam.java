package Application;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

import java.util.Scanner;

public class Progam {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true){
            Ui.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = Ui.readChessPosition(sc);

            System.out.print("\nTarget: ");
            ChessPosition target = Ui.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
        }



    }
}
