public class Bishop extends Piece {

    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return null;
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        return false;
    }
}
