

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
    if (row < 0 || row > 7 || col < 0 || col > 7) {
      throw new IllegalArgumentException("Creating a chess piece here is forbidden", null);
    }
    System.out.println("I'm inside the parent class");
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
    if (row > 7 || row < 0 || column > 7 || column < 0) {
      return false;
    }
    else return true;
  }
}