package exceptionH;

import java.util.Scanner;
class in
{
	int x=1;
	public int enter()
	
	
	{
		
		int sum=0;
		System.out.println("  Please enter two numbers for your turn " + x);
		Scanner obj = new Scanner(System.in);
		try {
			int a= obj.nextInt();
			int b= obj.nextInt();
			sum= a+b;
			return sum;
		}catch(Exception e)
		{
			System.out.println(e.getMessage() + "  please try again");
			x++;
		    return 0;
		}
	
		
		
	}
	
}
public class input {
public static void main(String a[])
{
	in obj= new in();
	int z= obj.enter();
	while(z==0)
	{
		z= obj.enter();
	}
	System.out.print(z);
}
}

