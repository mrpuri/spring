package practice;

public class Final1 {
final int x=0;
public void value()
{
	System.out.print("the value of x is = " + x);
	x= 10;
	
}
final class Final2{
	int a=0;
}
class inherit extends Final2{
	
}
class method
{
	final public void run(int a)
	{
		System.out.print(a);
	}
	
}
class method2 extends method
{
	public void run(int a)
	{
		System.out.print(a);
	}
}


}
