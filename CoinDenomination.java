import java.util.*;

class CoinDenomination{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

double TV = 400.00, VCR = 220.00, RemoteCtrlr = 35.20, CDPlyr = 300.00, TapeRcrdr = 150.00, SalesTax = 0.0825;
double p1, p2, p3, p4, p5, slstx, subtotal, total;

System.out.println("How many TVs were sold? ");
int quanTV = sc.nextInt();
System.out.println("How many VCRs were sold? ");
int quanVCR = sc.nextInt();
System.out.println("How many remote controllers were sold? ");
int quanRC = sc.nextInt();
System.out.println("How many CD players were sold? ");
int quanCDP = sc.nextInt();
System.out.println("How many tape recorders were sold? ");
int quanTR = sc.nextInt();

p1 = quanTV*TV;
p2 = quanVCR*VCR;
p3 = quanRC*RemoteCtrlr;
p4 = quanCDP*CDPlyr;
p5 = quanTR*TapeRcrdr;
subtotal = p1+p2+p3+p4+p5;
slstx = subtotal*SalesTax;
total = subtotal+slstx;

System.out.println("\nQTY     DESCRIPTION     UNIT PRICE     TOTAL PRICE");
System.out.println("\n---     -----------     ----------     -----------");
System.out.println("\n "+quanTV+"      TV              $"+TV+"         $"+p1);
System.out.println("\n "+quanVCR+"      VCR             $"+VCR+"         $"+p2);
System.out.println("\n "+quanRC+"      REMOTE CTRLR    $"+RemoteCtrlr+"          $"+p3);
System.out.println("\n "+quanCDP+"      CD PLAYER       $"+CDPlyr+"         $"+p4);
System.out.println("\n "+quanTR+"      TAPE RECORDER   $"+TapeRcrdr+"         $"+p5);
System.out.println("\n                                        __________");
System.out.println("\n                              Subtotal: $"+subtotal);
System.out.println("\n                        Sales Tax 8.25: $"+SalesTax);
System.out.println("\n                                 Total: $"+total);
}
}