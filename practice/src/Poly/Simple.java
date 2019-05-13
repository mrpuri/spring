package Poly;

public class Simple {
public int area(int x, int y)
{
	int z=x*y;
	return z;
}
public double area(double r)
{
	return 2.14*r*r;
}
public int area(int a)
{
	return a*a;
}
}
class Simple2 extends Simple{
	public int area(int a, int b, int c)
	{
		return a*b*c;
	}
}

