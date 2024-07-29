import java.util.Scanner;
public class CharacterCount{
   public static void main(String[] args){
      String characters;
      int consonantsNum = 0, vowelsNum = 0, punctuationsNum = 0, spacesNum = 0;
   
      Scanner input = new Scanner(System.in);
   
      System.out.println("Enter characters: ");
      characters = input.nextLine().toLowerCase();
   
      for(int num = 0 ; num < characters.length() ; num++){
         switch(characters.charAt(num)){
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

   }
}