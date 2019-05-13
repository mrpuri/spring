package myspringapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Student obj = new Student();
		obj.setName("Harman");
		obj.setAddress("Jalandhar");
		System.out.println(obj);
		
		Student obj2 = new Student("Chetan Sharma", "India");
		System.out.println(obj2);
		 */
		
		//Resource res = new ClassPathResource("Beans.xml");
		//BeanFactory beanFactory = new XmlBeanFactory(res);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student stud1obj = (Student) context.getBean("stud1");
		//Student stud1obj = (Student) beanFactory.getBean("stud1");
		stud1obj.setName("Harman");
		stud1obj.setAddress("Jalandhar");
		System.out.println(stud1obj);
	/*	Student stud2obj = (Student) context.getBean("stud2");
		System.out.println(stud2obj);
		Student stud3obj = (Student) context.getBean("stud3");
		System.out.println(stud3obj);
		
		((ClassPathXmlApplicationContext)context).registerShutdownHook();
		*/
	}

}
