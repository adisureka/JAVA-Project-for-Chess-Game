
/**
* Class Rook -
* We want this file to have methods that other files can inherit.
*/
class Rook extends Chess {

  private int row;
  private int column;
  private Color color;

  /**
  * Rook Constructor with 3 parameters.
  */
  public Rook(int row, int column, Color color) {
    super(row, column, color);
    System.out.println("Inside Child Rook Class");
    this.row = row;
    this.column = column;
    this.color = color;
  }
  
  @Override
  public Color getColor() {
    return Color.WHITE;
  }

  /**
  *
  */  
  public Rook() {
  }

  /**
  *
  */
  public boolean canAttack(Chess other) {
    if (this.color == other.getColor()) {
      return false;
    }
    else return canMove(other.getRow(), other.getColumn());
  }

  /**
  *
  */  
  public boolean canMove(int row, int column) {
    if (super.canMove(row, column)){
      if (row == this.row) {
        return true;
      }
      else if (column == this.column) {
        return true;
      }
      else return false;
    }
    else return false;
  }
    // because we can combine them using logical operators as shown above or
    // one line of code as shown belown in comments
    // return row == this.row || column == this.column;
}
