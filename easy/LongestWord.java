import java.util.*; 
import java.io.*;

/*
Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. 
If there are two or more words that are the same length, return the first word from the string with that length. 
Ignore punctuation and assume sen will not be empty. 
*/

public class LongestWord {  
  public static String LongestWord(String sen) { 
    String regex = "[^a-zA-Z0-9]";
    String[] words = sen.replaceAll(regex, " ").split(" ");
    String longestWord = "";
    for(int i = 0; i < words.length; i++){
        if(words[i].length() > longestWord.length()) {
        	longestWord = words[i];
        }
    }
    return longestWord;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
}
