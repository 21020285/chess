public class Bishop extends Piece {

    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        int xx = this.getCoordinatesX();
        int yy = this.getCoordinatesY();
        int difX = Math.abs(x - xx);
        int difY = Math.abs(y - yy);
        if (difX != difY) {
            return false;
        } else {
            int diffX = x > this.getCoordinatesX() ? 1 : -1;
            int diffY = y > this.getCoordinatesY() ? 1 : -1;
            int num = Math.abs(x - this.getCoordinatesX());

            for (int i = 1; i <= num; i++) {
                Piece piece = board.getAt(this.getCoordinatesX() + i * diffX,
                        this.getCoordinatesY() + i * diffY);
                if (piece != null) {
                    return false;
                }
            }

            if (board.getAt(x, y) != null
                    && board.getAt(x, y).getColor().equals(this.getColor())) {
                return false;

            }
        }

        return true;
    }

    @Override
    public String getColor() {
        return null;
    }
}
