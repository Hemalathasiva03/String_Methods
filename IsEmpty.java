// String isEmpty() method

import java.util.Scanner;

public class IsEmpty {

    public static void main(String[] args) {
      
      Boolean b = true;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string : ");
      String str = sc.nextLine();
      int strlen =str.length();
		  if(strlen == 0){
			System.out.println(b);
		}
		else
		{
		  b = false;
		System.out.println(b);
	}
}
}

/*OUTPUT:
Enter the string : hema
false
*/