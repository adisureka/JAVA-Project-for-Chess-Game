
/**
* Class King -
* We want this file to have methods that other files can inherit.
*/
class Knight {

  private int row;
  private int column;
  private Color color;

  /**
  * King Constructor with 3 parameters.
  */
  public Knight(int row, int column, Color color) {
    this.row = row;
    this.column = column;
    this.color = color;
  }

  /**
  *
  */  
  public Knight() {
  }

  /**
  *
  */  
  public boolean canMove(int row, int column) {
    
    // Case Forward or Backward 
    if ((row == this.row + 2 && (column == this.column - 1 || column == this.column + 1)) 
          || (row == this.row - 2 && (column == this.column - 1 || column == this.column + 1))) {
      return true;
    }

    // Case Left or Right
    if ((column == this.column + 2 && (row == this.row - 1 || row == this.row + 1)) 
          || (column == this.column - 2 && (row == this.row - 1 || row == this.row + 1))) {
      return true;
    }

    else return false;

  }

  /**
  private boolean canMove1(int row, int column) {
    
    // Case Diagonal (Square -1, -1),

    if (row == this.row - 1) {
    }

    if (row == this.row) {
    }

    if (row == this.row + 1) {
    }
    */


  /**
  *
  */  
  public boolean canAttack(King other) {
    if (this.color == other.getColor()) {
      return false;
    }
    else return canMove(other.getRow(), other.getColumn());
  }



  /**
  * Getter.
  */
  public int getRow() {
    return this.row;
  }


  /**
  * Getter.
  */
  public int getColumn() {
    return this.column;
  }

  /**
  * Getter.
  */
  public Color getColor() {
    return this.color;
  }

}
