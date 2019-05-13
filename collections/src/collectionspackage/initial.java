package collectionspackage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class initial {
	
public static void main(String args[])
{
	ApplicationContext cont = new ClassPathXmlApplicationContext("beans.xml");
	example ex = (example)cont.getBean("example");
	ex.getList();
	ex.getMap();
	ex.getProp();
	ex.getSet();
	
	
}
}
