package practice;

import java.util.Scanner;

public class This1 {
	int y;
	This1()
	{
		int z=10;
	}
This1(int x)
{
	this();
	
	System.out.print(y);
}
class This2 extends This1{
	int a=10;
	This2()
	{
	super.y= this.a;
	}
}
public static void main(String args[])
{
	This1 obj = new This1(10);
	String a = new String();
	Scanner obj1 = new Scanner(System.in);
	
	a = obj1.next();
	
	StringBuffer ob = new StringBuffer();
	ob.append(a);
	
}
}

