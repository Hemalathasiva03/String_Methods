// String concat() method

import java.util.Scanner;

class stringConcat
{
 public static void main(String args[])
 {
 String str1,str2;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the 1st string");
 str1=sc.nextLine();
 System.out.println("Enter the 2nd string");
 str2=sc.nextLine();
   System.out.println("Concatenated String is ");
   System.out.println(str1+str2);
 }
}

/*Output:
Enter the 1st string hema
Enter the 2nd string latha
Concatenated String is hemalatha
*/
