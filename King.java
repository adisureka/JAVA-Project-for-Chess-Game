
/**
* Class King -
* We want this file to have methods that other files can inherit.
*/
class King {

  private int row;
  private int column;
  private Color color;

  /**
  * King Constructor with 3 parameters.
  */
  public King(int row, int column, Color color) {
    this.row = row;
    this.column = column;
    this.color = color;
  }

  /**
  *
  */  
  public King() {
  }

  /**
  *
  */  
  public boolean canMove(int row, int column) {
    
    // Case Diagonal (Square -1, -1), 
    if ((row == this.row - 1 && column == this.column - 1) || (row == this.row + 1 && column == this.column - 1)
          || (row == this.row + 1 && column == this.column + 1) || (row == this.row - 1 && column == this.column + 1)) {
      return true;
    }

    // Case Horizontal (Square 0, -1), (Square 0, +1),
    if ((row == this.row && column == this.column - 1) ||(row == this.row && column == this.column + 1)) {
      return true;
    }

    // Case Vertical (Square +1, 0) and (Square -1, 0)
    if ((row == this.row + 1 && column == this.column) ||(row == this.row - 1 && column == this.column)) {
      return true;
    }

    else return false;

  }

  private boolean canMove1(int row, int column) {
    
    // Case Diagonal (Square -1, -1),

    if (row == this.row - 1) {
    }

    if (row == this.row) {
    }

    if (row == this.row + 1) {
    }





    if ((row == this.row - 1 && column == this.column - 1) || (row == this.row + 1 && column == this.column - 1)
          || (row == this.row + 1 && column == this.column + 1) || (row == this.row - 1 && column == this.column + 1)) {
      return true;
    }

    // Case Horizontal (Square 0, -1), (Square 0, +1),
    if ((row == this.row && column == this.column - 1) ||(row == this.row && column == this.column + 1)) {
      return true;
    }

    // Case Vertical (Square +1, 0) and (Square -1, 0)
    if ((row == this.row + 1 && column == this.column) ||(row == this.row - 1 && column == this.column)) {
      return true;
    }

    else return false;
    
  }



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
