import java.text.*;
public class TablesofSines{
   public static void main(String[] args){

   double angle = -90.0, radian;
   System.out.println("angle          sine");
   System.out.println("-----          ----");
   DecimalFormat angleForm = new DecimalFormat(" 0.0;-0.0");
   DecimalFormat sineForm = new DecimalFormat(" 0.0#####;-0.0#####");
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   angle += 15.0;
   radian = Math.toRadians(angle);
   System.out.println(angleForm.format(angle)+"          "+sineForm.format(Math.sin(radian)));
   
   }
}