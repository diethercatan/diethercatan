/* Modify the program that prints out a table of x and ln(x) 
   so that the table is formatted using HTML */
//Run your program and redirect the output to a disk file
//You should now be able to view your output file with a Web browser
public class LogTable {
   public static void main(String[] args) {
   
      System.out.println("<!DOCTYPE html>");
      System.out.println("<html>");
      System.out.println("<title>My Logs</title>");
      System.out.println("<body>");
      System.out.println("<table border=\"1\">");
      System.out.println("<tr>");
      System.out.println("    <th>x</th>");
      System.out.println("    <th>ln(x)</th>");
      System.out.println("</tr>");

      //For each iteration of the loop, calculate x and logx and print the line
      for (double x = 0.1 ; x <= 2.0 ; x = x + 0.1) {
         System.out.println("<tr>");
         System.out.println("    <td>" + x + "</td>");
         System.out.println("    <td>" + Math.log(x) + "</td>");
         System.out.println("</tr>" );
      }
      
      System.out.println("</table>");
      System.out.println("</body>");
      System.out.println("</html>");
   }
}