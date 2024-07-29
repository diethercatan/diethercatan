class ChangeArray {
  private int j;

  public void print(int[] x) {
    for (j = 0 ; j < x.length ; j++)
      System.out.print(x[j] + " ");
    System.out.println( );
  }

  public void zeroElt(int[] x, int elt) {
    if (elt < x.length)                       
      x[elt] = 0;                             
  }
   
  public void zeroAll(int[] ar) {
   for (j = 0 ; j < ar.length ; j++)
      ar[j] = 0;
  }
}

public class ChangeTest {
  public static void main(String[] args) {
    ChangeArray cng = new ChangeArray();        
    
    int[] value = {27, 19, 34, 5, 12};         
    
    System.out.println("Before:");            
    cng.print(value);
    
    cng.zeroAll(value);                   
    System.out.println("After:");             
    cng.print(value);
  }
}