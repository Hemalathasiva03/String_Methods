// String indexOf() method

import java.util.Scanner;

public class StrIndexOf{  
  
public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
	  String str = sc.nextLine();
	  System.out.println("Enter the index of the String : ");
	  char ch = sc.next().charAt(0);
	  int len = str.length();
		char[] arr =  str.toCharArray();
		for(int index =0;index<len;index++){
			if(ch== arr[index]){
				System.out.println(index);
			}
		}
	}
}

/*OUTPUT:
Enter the String : hemalatha
Enter the index of the String : m
2
*/