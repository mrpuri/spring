package practice;

public class Exep{
	int a=0;
	int b=10;
	public int typ()  throws ArithmeticException
	{
try
{
	int c=b/a;
	//throw ArithmeticException;
}catch(Exception e)
{
	System.out.print("cannot divide due to = " + e.getMessage());
}
finally
{
	int c = a/b; 
}
return 0;
	}
}
