class Weight2 {
  private int[] data;
  private int sum = 0;

  public Weight2(int[] init) {
    data = new int[init.length];

    for (int j = 0 ; j < data.length ; j++) 
      data[j] = init[j];
  }
  
  public int subAverage(int start, int end) {
    for (start = start - 1 ; start < end - 1 ; start++) 
      sum += data[start];

    return sum / (end - 1);
  }
}

public class WeightTester2 {  
  public static void main(String[] args) {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
                    
    Weight2 june = new Weight2(values);
    int subAvg1 = june.subAverage(1,15);
    int subAvg2 = june.subAverage(16,30);
    
    System.out.println("Sub Average (first half-month) = " + subAvg1);
    System.out.println("Sub Average (second half-month) = " + subAvg2);
    System.out.println("The difference is " + Math.abs(subAvg1-subAvg2));
  }
}      