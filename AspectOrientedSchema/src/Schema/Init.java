package Schema;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Init {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      
	      Student student = (Student) context.getBean("student");
	      student.getName();
	      student.getAge();
	      student.getAddress();
	      student.printThrowException();
}
}
