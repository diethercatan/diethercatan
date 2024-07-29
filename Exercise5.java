public class Exercise5 {
  public static void main(String[] args) {
    int[] val = {0, 1, 2, 3}; 
    int temp;
 
    System.out.println("Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
 
    //Reverse the order of the numbers in the array
    for (temp = 0 ; temp < val.length ; temp++)
      val[temp] = 3 - temp;
 
    System.out.println("Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
  }
}