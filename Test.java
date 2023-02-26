class Test {

	public static void main(String args []) {

		Rook r = new Rook(3, 4, Color.BLACK);

		System.out.println(r.getColor());
		System.out.println(r.canMove(0, 2));
		System.out.println(r.canAttack(new Rook(7, 4, Color.WHITE)));
		System.out.println("=====================================================");

		Chess O = new Rook(4, 3, Color.BLACK);
		System.out.println(O.getColor());
		//System.out.println(O.canMove(0, 2));
		//System.out.println(O.canAttack(new Rook(7, 4, Color.WHITE)));
		System.out.println("=====================================================");
		
		Bishop b = new Bishop(-1, 2, Color.BLACK);
		System.out.println(b.canMove(9, 10));

		System.out.println(b.canAttack(new Bishop(2, 3, Color.WHITE)));

		System.out.println(b.canAttack(new Chess(2, 3, Color.WHITE)));

		/**
		System.out.println(r.canMove(0, 0));
		System.out.println(r.canMove(7, 4));
		System.out.println(r.canAttack(new Rook(7, 4, Color.WHITE)));

		King k = new King(1, 3, Color.BLACK);
		
		System.out.println(k.canMove(0,2));
		System.out.println(k.canMove(1,2));
		System.out.println(k.canMove(2,2));
		System.out.println(k.canMove(2,3));
		System.out.println(k.canMove(2,4));
		System.out.println(k.canMove(1,4));
		System.out.println(k.canMove(0,4));
		System.out.println(k.canMove(0,3));

		Knight n = new Knight();
*/
    }
}