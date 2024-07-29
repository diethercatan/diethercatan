import java.text.*;
public class TablesofSines1{
   public static void main(String[] args){

   double angle = -90.0, radian;
   System.out.println("angle          sine");
   System.out.println("-----          ---------");
   do{
       if(angle<0.0){
       DecimalFormat angleForm = new DecimalFormat("0.0");
       DecimalFormat sineForm = new DecimalFormat("0.0#####");
       radian = Math.toRadians(angle);
       System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
       }else if(angle==0.0){
       DecimalFormat angleForm = new DecimalFormat("  0.0");
       DecimalFormat sineForm = new DecimalFormat(" 0.0#####");
       radian = Math.toRadians(angle);
       System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
       }else{
       DecimalFormat angleForm = new DecimalFormat(" 0.0");
       DecimalFormat sineForm = new DecimalFormat(" 0.0#####");
       radian = Math.toRadians(angle);
       System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
       }
     angle += 15.0;
     }
   while(angle<=90.0);
   
   }
}