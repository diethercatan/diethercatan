class Searcher {
  public static int search(String[] array, String target) {
    for (int j = 0 ; j  < array.length; j++) {
       if (array[j] != null) 
         if (array[j].equals(target)) return j;
    }
        
    return -1;
  }
}

public class SearchTester {
  public static void main(String[] args) {
    final int theSize = 20 ;
    String[] strArray = new String[theSize] ;  
    strArray[5] = "Peoria";

    int where = Searcher.search( strArray, "Peoria" );
    
    if ( where >= 0 )
      System.out.println("Target found in cell " + where );
      
    else
      System.out.println("Target not found" );

  }
}
