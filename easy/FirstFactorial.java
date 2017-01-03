import java.util.*; 
import java.io.*;

/*
Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it 
(e.g. if num = 4, return (4 * 3 * 2 * 1)). 
For the test cases, the range will be between 1 and 18 and the input will always be an integer.
*/

class Main {  
  public static int FirstFactorial(int num) { 
    int factorial = 1;
    for(int i = 1; i <= num; i++) {
        factorial *= i;
    }
    return factorial;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }   
}
