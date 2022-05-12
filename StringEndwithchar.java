// String endWithchar() method 

import java.util.*;

class StringEndwithchar{
    public static void main(String[] args) {
        System.out.println(endsWith("this is a test", "test")); //True
        System.out.println(endsWith("This is another test", "test2"));  //False
    }
public static boolean endsWith(String str, String suffix)
{  
        return (str.lastIndexOf(suffix) == str.length() - suffix.length()); 
}
}

/*OUTPUT:
true
false
*/