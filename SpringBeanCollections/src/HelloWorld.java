
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloWorld {

	public static void main(String ar[])
	{
		System.out.print("Hello");
		ApplicationContext cont = new ClassPathXmlApplicationContext("beans.xml");
		example ex = (example)cont.getBean("example");
		List list = ex.getList();
		ex.getMap();
		ex.getProp();
		ex.getSet();
		Iterator it = list.iterator();
		System.out.println("In Main Application class, iterating list elements: ");
		while(it.hasNext())
		{
			Object list_item = it.next();
			if(list_item instanceof Student)
			{
				Student stud_obj = (Student)list_item;
				System.out.println(stud_obj.getName());
			}
			else
			{
				String val = (String)list_item;
				System.out.println(val);
			}
		}
		
	}
}
