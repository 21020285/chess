public class Rock extends Piece {

    public Rock(int x, int y) {
        super(x, y);
    }

    public Rock(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }

        if (x != this.getCoordinatesX() && y != this.getCoordinatesY()) {
            return false;
        }

        if (board.getAt(x, y) != null
                && board.getAt(x, y).getColor().equals(this.getColor())) {
            return false;
        }

        if (x == this.getCoordinatesX()) {
            if (this.getCoordinatesY() <= y) {
                for (int i = 1; this.getCoordinatesY() + i < y; i++) {
                    int yy = this.getCoordinatesY() + i;
                    if (board.getAt(x, yy) != null) {
                        return false;
                    }
                }
            } else {
                for (int i = 1; this.getCoordinatesY() - i > y; i++) {
                    int yy = this.getCoordinatesY() - i;
                    if (board.getAt(x, yy) != null) {
                        return false;
                    }
                }
            }
        }

        if (y == this.getCoordinatesY()) {
            if (this.getCoordinatesX() <= x) {
                for (int i = 1; this.getCoordinatesX() + i < x; i++) {
                    int xx = this.getCoordinatesX() + i;
                    if (board.getAt(xx, y) != null) {
                        return false;
                    }
                }
            } else {
                for (int i = 1; this.getCoordinatesX() - i > x; i++) {
                    int xx = this.getCoordinatesX() - i;
                    if (board.getAt(xx, y) != null) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    @Override
    public String getColor() {
        return null;
    }
}
