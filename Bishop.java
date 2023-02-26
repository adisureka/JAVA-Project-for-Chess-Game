public class Bishop extends Chess {

    private int row;
    private int column;
    private Color color;

    public Bishop() {
    }

    public Bishop(int row, int column, Color color) {
        super(row, column, color);
        this.row = row;
        this.column = column;
        this.color = color;
    }

    public boolean canMove(int row, int column) {
        // x1 - x2 == y1 - y2 (squared)
        int row_difference = (this.row - row);
        int column_difference = (this.column - column);
        
        if (super.canMove(row, column) && row_difference * row_difference == column_difference * column_difference) {
            return true;
        }
        else return false;
    }

    public boolean canAttack(Chess other) {
        if (this.color == other.getColor()) {
            return false;
        }
        else return canMove(other.getRow(), other.getColumn());
    }
}
