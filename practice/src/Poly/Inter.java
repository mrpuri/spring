package Poly;

abstract class Inter {
abstract int a();
}

class exapmle extends Inter{
	int a()
	{
		return 0;
	}
	
}
class example2 extends Inter{
	int a()
	{
		return 1;
	}
}
 class m{
	public static void main(String args[])
	{
	//example obj = new example();
	example2 obj = new example2();
		
		obj.a();
	}
}