// String length() method

import java.util.Scanner;

public class StringLength {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string : ");
      String str = sc.nextLine(); 
      int i = 0;
      for(char c: str.toCharArray()) 
      {
         i++;
      }
      System.out.println("Length of the given string : "+i);
   }
}

/*OUTPUT:
Enter the string : hemalatha
Length of the given string : 9
*/