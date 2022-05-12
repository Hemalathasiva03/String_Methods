// String compareTo() method

import java.util.Scanner;

public class CompareStrings {

 public static boolean compare(String str1, String str2){
 if(str1==null || str2==null){
 return false;
 }
 //compare lengths
 if(str1.length()!=str2.length())
 return false;

 //compare all characters
 for (int i = 0; i <str1.length() ; i++) {
 if(str1.charAt(i)!=str2.charAt(i))
 return false;
 }
 //if here, means both strings are equal
 return true;
 }

public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter the String1 : ");
 String str1 = sc.nextLine();
 System.out.println("Enter the String2 : ");
 String str2 = sc.nextLine();
 boolean b=compare(str1,str2);
 System.out.println(b);
 }
}

/*OUTPUT:
Enter the String1 : hema
Enter the String2 : hema
true
*/