public class Queen extends Bishop {

    private int row;
    private int column;
    private Color color;

    public Queen() {
    }

    public Queen(int row, int column, Color color) {
        
        super(row, column, color);
        if (row < 0 || row > 7 || column < 0 || column > 7) {
            throw new IllegalArgumentException("Creating a chess piece here is forbidden", null);
        }
        this.row = row;
        this.column = column;
        this.color = color;
    }

    public boolean canMove(int row, int column) {
        if (super.canMove(row, column)) {
            return true;
        }
        else if (this.row == row) {
            return true;
        }
        else if (this.column == column) {
            return true;
        }
        else return false;
    }

    public boolean canAttack(Chess opponent) {
        if (this.color == opponent.getColor()) {
            return false;
        }
        else return canMove(opponent.getRow(), opponent.getColumn());
    }
    
}
