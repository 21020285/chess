import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    public Board() {

    }

    public void addPiece (Piece piece) {

    }

    public boolean validate (int x, int y) {
        if (x > WIDTH || x < 1 || y > HEIGHT || y < 1) {
            return false;
        }
        return true;
    }

    public void removeAt(int x, int y) {

    }

    public Piece getAt(int x, int y) {
        return null;
        //later
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

}
