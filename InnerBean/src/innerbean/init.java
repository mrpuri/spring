package innerbean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class init {
 public static void main(String a[])
 {
	 ApplicationContext cont = new ClassPathXmlApplicationContext("beans.xml");
	 TextEditor tx= (TextEditor)cont.getBean("TextEditor");
	 tx.spellCheck();
 }
}
