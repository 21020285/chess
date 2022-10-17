import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    public Board() {

    }

    public void addPiece (Piece piece) {
        for (int i = 0; i < pieces.size(); i++) {
            if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())
                    && piece.getCoordinatesX() != pieces.get(i).getCoordinatesX()
                    && piece.getCoordinatesY() != pieces.get(i).getCoordinatesY()) {
                return;
            }
        }
        pieces.add(piece);
    }

    public boolean validate (int x, int y) {
        if (x > WIDTH || x < 1 || y > HEIGHT || y < 1) {
            return false;
        }
        return true;
    }

    public void removeAt(int x, int y) {
        Piece r = new Rock(x,y);
        for (int i = 0; i < pieces.size(); i++) {
            if (validate(r.getCoordinatesX(), r.getCoordinatesY())
                    && r.getCoordinatesX() == pieces.get(i).getCoordinatesX()
                    && r.getCoordinatesY() == pieces.get(i).getCoordinatesY()) {
                return;
            }
        }
        pieces.remove(r);
    }

    public Piece getAt(int x, int y) {
        Piece r = new Rock(x,y);
        for (int i = 0; i < pieces.size(); i++) {
            if (validate(r.getCoordinatesX(), r.getCoordinatesY())
                    && r.getCoordinatesX() == pieces.get(i).getCoordinatesX()
                    && r.getCoordinatesY() == pieces.get(i).getCoordinatesY()) {
                return r;
            }
        }
        return null;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

}
