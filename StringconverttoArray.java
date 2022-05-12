// StringconverttoArray() method

import java.util.Scanner;

public class StringconverttoArray {

	// Main driver method
	public static void main(String args[])
	{

		// User input string
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// Creating array of string length
		// using length() method
		char[] ch = new char[str.length()];

		// Copying character by character into array
		// using for each loop
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}

		// Printing the elements of array
		// using for each loop
		for (char c : ch) {
			System.out.println(c);
		}
	}
}

/*OUTPUT:
h
e
m
a
l
a
t
h
a
*/