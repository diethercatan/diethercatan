//Add more acronyms to the last example of the chapter
//Use some acronyms that use punctuation or have internal spaces
//Extend the program so that it reads in a complete line of text from the user and outputs a complete line of text
//Use Scanner.hasNext() and Scanner.next() to read input tokens one by one
import java.util.Scanner;
public class InternetAcronymns{
   public static void main(String[] args){
      String acronym = "", acronymInput;
      boolean bool = true;
      
      Scanner input = new Scanner(System.in);
      
      //Wrap a loop around it so that the usr is repeatedly asked for input 
      do {
         System.out.println("Enter Acronym: [Enter \"exit\" to EXIT]");
         bool = input.hasNextLine();
         acronymInput = input.nextLine().trim().toLowerCase();
         
         for(int num = 0 ; num < acronymInput.length() ; num++){
            switch(acronymInput.charAt(num)){
               case ' ':; break;
               case 'a': case 'b': case 'c': case 'd': case 'e': case 'f': case 'g': case 'h': case 'i': case 'j': 
               case 'k': case 'l': case 'm': case 'n': case 'o': case 'p': case 'q': case 'r': case 's': case 't': 
               case 'u': case 'v': case 'w': case 'x': case 'y': case 'z': acronym += acronymInput.charAt(num); break;
               default:; break;
            }
         }
         
         System.out.println(acronym);
         
         //All acronyms in the output text are replaced by the phrase they stand for
         switch(acronym.toUpperCase()){
            case "AFAIK": System.out.println("Backronym: As Far As I Know\n"); break;
            case "ATM": System.out.println("Backronym: At The Moment\n"); break;
            case "BBL": System.out.println("Backronym: Be Back Later\n"); break;
            case "BFF": System.out.println("Backronym: Best Friends Forever\n"); break;
            case "BRB": System.out.println("Backronym: Be Right Back\n"); break;
            case "BTW": System.out.println("Backronym: By The Way\n"); break;
            case "CTN": System.out.println("Backronym: Can't Talk Now\n"); break;
            case "FYI": System.out.println("Backronym: For Your Information\n"); break;
            case "GG": System.out.println("Backronym: Good Game\n"); break;
            case "GJ": System.out.println("Backronym: Good Job\n"); break;
            case "GL": System.out.println("Backronym: Good Luck\n"); break;
            case "GTG": System.out.println("Backronym: Got To Go\n"); break;
            case "IAC": System.out.println("Backronym: In Any Case\n"); break;
            case "IC": System.out.println("Backronym: I See\n"); break;
            case "IDK": System.out.println("Backronym: I Don't Know\n"); break;
            case "IKR": System.out.println("Backronym: I Know, Right?\n"); break;
            case "ILY": System.out.println("Backronym: I Love You\n"); break;
            case "ILYSM": System.out.println("Backronym: I Love You So Much"); break;
            case "ILYSB": System.out.println("Backronym: I Love You So Bad\n"); break;
            case "IMO": System.out.println("Backronym: In My Opinion\n"); break;
            case "IMHO": System.out.println("Backronym: In My Humble Opinion\n"); break;
            case "IMY": System.out.println("Backronym: I Miss You\n"); break;
            case "IMYSM": System.out.println("Backronym: I Miss You So Much\n"); break;
            case "IRL": System.out.println("Backronym: In Real Life\n"); break;
            case "JK": System.out.println("Backronym: Just Kidding\n"); break;
            case "LMK": System.out.println("Backronym: Let Me Know\n"); break;
            case "LOL": System.out.println("Backronym: Laugh Out Loud\n"); break;
            case "NC": System.out.println("Backronym: No Comment\n"); break;
            case "NM": System.out.println("Backronym: Not Much\n"); break;
            case "NP": System.out.println("Backronym: No Problem\n"); break;
            case "NTN": System.out.println("Backronym: No Thanks Needed\n"); break;
            case "OMG": System.out.println("Backronym: Oh My Gosh\n"); break;
            case "OMW": System.out.println("Backronym: On My Way\n"); break;
            case "SLR": System.out.println("Backronym: Sorry, Late Reply\n"); break;
            case "SMH": System.out.println("Backronym: Shaking My Head\n"); break;
            case "TBA": System.out.println("Backronym: To Be Announced\n"); break;
            case "TBC": System.out.println("Backronym: To Be Continued\n"); break;
            case "TC": System.out.println("Backronym: Take Care\n"); break;
            case "TMI": System.out.println("Backronym: Too Much Information\n"); break;
            case "TTYL": System.out.println("Backronym: Talk To You Later\n"); break;
            case "TYT": System.out.println("Backronym: Take Your Time\n"); break;
            case "TY": System.out.println("Backronym: Thank You\n"); break;
            case "YW": System.out.println("Backronym: You're Welcome\n"); break;
            case "EXIT": bool = false; break;
            default: System.out.println("Unknown\n"); break;
         }  
         
         acronym = "";
         
      } while (bool);
      
      input.close();
      
      System.out.println("End of the Program!");
  
   }
}
  