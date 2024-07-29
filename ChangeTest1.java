class ChangeArray1 {
  private int j;

  public void print(int[] x) {
    for (j = 0 ; j < x.length ; j++)
      System.out.print(x[j] + " ");
    System.out.println( );
  }

  // Copy source to target
  public void copy(int[] source, int[] target) {
   for (j = 0 ; j < source.length ; j++) 
      target[j] = source[j];
  }
}

public class ChangeTest1 {
  public static void main(String[] args) {
    ChangeArray1 cng = new ChangeArray1();
    int[] s = {27, 19, 34, 5, 12} ;
    int[] t = new int[s.length];
    
    cng.copy(s,t);
    System.out.println("After copy:");
    cng.print(t);
  }
}