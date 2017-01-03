import java.util.*; 
import java.io.*;

/*
Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word. 
Words will be separated by only one space. 
*/

public class LetterCapitalize {  
  public static String LetterCapitalize(String str) { 
    String[] words = str.split(" ");
	String upperCase = "", restOfWord = "";
	StringBuilder finalWord = new StringBuilder();
	for(int i = 0; i < words.length; i++) {
		upperCase = words[i].substring(0,  1).toUpperCase();
		restOfWord = words[i].substring(1);
		finalWord.append(upperCase + restOfWord + " ");
	}
	return finalWord.toString();
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
}
