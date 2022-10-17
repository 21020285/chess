import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    public Game(Board board) {
        this.board = board;
    }

    /**
     * check whether piece can move.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Piece killedPiece = board.getAt(x, y);
            int xx = piece.getCoordinatesX();
            int yy = piece.getCoordinatesY();
            Piece movedPiece = piece;
            Move move = new Move(xx, x,
                    yy, y, movedPiece, killedPiece);
            moveHistory.add(move);
            if (killedPiece != null) {
                board.removeAt(x, y);
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
