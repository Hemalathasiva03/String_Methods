// ObjectToString method

import java.util.*;

public class ObjectToString
{  
public static void main(String args[]){  
Emp e=new Emp();  
System.out.println((e == null)? null : e.toString()); 
}
}  
class Emp{}  

/* OUTPT:
Emp@704d6e83
*/