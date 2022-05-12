// String Uppertolower case method

import java.util.Scanner;

public class Uppertolower 
{
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                System.out.println("Upper case String is : " + str);
                char strArr[] = str.toCharArray();
                for (int i = 0; i < strArr.length; i++) {
                        // here is the actual logic
                        if (strArr[i] >= 'A' && strArr[i] <= 'Z') 
                        {
                                strArr[i] = (char) ((int) strArr[i] + 32);
                        }
                }
                System.out.print("Lower case string is : ");
                // print the string array
                for (int i = 0; i < strArr.length; i++) {
                        System.out.print(strArr[i]);
                }
        }
}

/* OUTPUT:
Upper case String is : HEMALATHA
Lower case string is : hemalatha
*/

