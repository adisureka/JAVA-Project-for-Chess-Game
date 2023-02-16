class Test {

  public static void main(String args[]) {

    Chess test1 = new King(1, 3, Color.BLACK);
    System.out.println(test1.getRow());
    System.out.println(test1.canMove(2,0));
  }
}