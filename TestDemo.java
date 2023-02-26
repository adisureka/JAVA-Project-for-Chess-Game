import java.util.Arrays;
class TestDemo{
	
  public static void main(String [] args) {
	String [][] board = new String[8][8];

    testCase(3,3, board);
  }

  public static void testCase(int row, int col, String[][]board)
  {
	King tester = new King(row, col, Color.BLACK);

	//Knight tester1 = new Knight(row, col, Color.BLACK);
    Knight tester1 = new Knight(4, 4, Color.BLACK);

    Queen tester2 = new Queen(4, 4, Color.BLACK);

	for(int i = 0; i < 8; i++) {
	  for(int j = 0; j < 8; j++) {
		if (tester1.canMove(i, j)) {
		  board[i][j] = "*";
		}
		else {
		  board[i][j] = ".";
		}
	  }
	}

	board[4][4] = "K";

	for(int i = 7; i >= 0; i--) {
	  System.out.println(Arrays.toString(board[i]));
	}
  }
}