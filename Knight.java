
/**
* Class Knight -
* We want this file to have methods that other files can inherit.
*/
class Knight extends Chess {

  private int row;
  private int column;
  private Color color;

  /**
  * Knight Constructor with 3 parameters.
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
    if (super.canMove(row, column)) {
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
    else return false;
    
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

}
