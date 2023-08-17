package basic_0817;

public class Ex_03_finalMethod {
    public static void main(String[] args) {

    }
    class Chess {
        enum ChessPlayer {
            WHITE, BLACK
        }

        ChessPlayer getFirstPlayer() {
            return ChessPlayer.WHITE;
        }
    }

    class WorldCChess extends Chess {
        @Override
        ChessPlayer getFirstPlayer() {
            return ChessPlayer.BLACK;
        }
    }
}
