package Poly;

public interface Interf {
 abstract int a();
}
class example implements Interf{

	@Override
	public int a() {
		System.out.print("");
		return 0;
		
	}
	
	
}
class two implements Interf{
	public int a()
	{
		System.out.print("ok" );
		return 1;
	}
}
