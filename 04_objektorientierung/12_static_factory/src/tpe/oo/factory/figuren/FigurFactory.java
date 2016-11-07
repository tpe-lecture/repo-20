package tpe.oo.factory.figuren;

import java.util.Random;

import tpe.oo.factory.GameBoard;

public class FigurFactory {

    private static final Random rnd = new Random();

    public static Figur createFigur(GameBoard board) {

        int n = rnd.nextInt(3);

        switch(n) {
            case(0):
                return new Ninja(board);
            case(1):
                return new Lady(board);
            case(2):
                return new Lady(board);
            default:
                return null;
        }


    }


}
