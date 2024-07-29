class unevenExample3 {
  public static void main(String[] arg) {
    int[][] uneven = 
        { { 1, 9, 4 },
          { 0, 2},
          { 0, 1, 2, 3, 4 } };

    for ( int row=0; row < uneven.length; row++ )
    {
      System.out.print("Row " + row + ": ");
      if ( uneven[row] == null )
        System.out.print( "empty" );
      else
      {
        for ( int col=0; col < uneven[row].length; col++ )
          System.out.print( uneven[row][col] + " ");
      }
      System.out.println();
    }
  }
}