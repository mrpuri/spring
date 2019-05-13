package practice;

class Sup {
	Sup()
	{
		System.out.print("constructor of sup");
	}
	int x= 5;
public void area(int x)
{
	System.out.print("area of a circle =" + 2.14*x*x);
}
}

class Super2 extends Sup{
	Super2()
	{
		super();
		System.out.println("constructor of super2");
		
	}
	int x =0;
	public void area(int y)
	{
		super.area(y);
		System.out.print(super.x);
		System.out.print("area of a square =" + y*y);
		System.out.print(x);
	}
}
public class Super1{
	public static void main(String args[])
	{
		Super2 obj = new Super2();
	}
}
