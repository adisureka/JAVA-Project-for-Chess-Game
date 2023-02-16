

/**
 * class Chess.
 */ 
public class Chess {
  private int row;
  private int col;
  private Color color;

  /**
   * Chess Constructor.
   */ 
  public Chess(int row, int col, Color color) {
    this.row = row;
    this.col = col;
    this.color = color;
  }

  public Chess() {}

  /**
   * .
   */ 
  public int getRow() {
    return this.row;
  }

  /**
   * .
   */ 
  public int getColumn() {
    return this.col;
  }

  public Color getColor() {
    return this.color;
  }

  public boolean canMove(int row, int column) {
    return true;
  }
}