import java.io.*;
public class CharacterCounterWithFileInput{
   public static void main(String[] args) throws IOException {
      int consonantsNum = 0, vowelsNum = 0, punctuationsNum = 0, spacesNum = 0;
      
      File myFile = new File("C:\\Users\\ACER\\Comprog12\\Diether_Catan_Gwapa_Kaayo.txt");
      FileInputStream fis = new FileInputStream(myFile);
      InputStreamReader isr = new InputStreamReader(fis);
      BufferedReader br = new BufferedReader(isr);
       
      String line = br.readLine().toLowerCase();
      
      for(int num = 0 ; num < line.length() ; num++){
      
         switch(line.charAt(num)){
            case ' ': spacesNum++; break;
            case 'a': case 'e': case 'i': case 'o': case 'u': vowelsNum++; break;
            case 'b': case 'c': case 'd': case 'f': case 'g': case 'h': case 'j': case 'k': case 'l': case 'm': case 'n':
            case 'p': case 'q': case 'r': case 's': case 't': case 'v': case 'w': case 'x': case 'y': case 'z': 
            consonantsNum+=1; break;
            default: punctuationsNum++; break;
         }
      }
   
      System.out.println("\n            Number of consonants: " + consonantsNum);
      System.out.println("                Number of vowels: " + vowelsNum);
      System.out.println("Number of Punctuation Characters: " + punctuationsNum);
      System.out.println("                Number of spaces: " + spacesNum);
            
      System.out.println("\n\tPERCENTAGES");
      System.out.println("Consonants: " + (consonantsNum*100)/line.length() + "%");
      System.out.println("    Vowels: " + (vowelsNum*100)/line.length() + "%");
      System.out.println("Characters: " + (punctuationsNum*100)/line.length() + "%");
      System.out.println("    Spaces: " + (spacesNum*100)/line.length() + "%");
      
      }
   }

  