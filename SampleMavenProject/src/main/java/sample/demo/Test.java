package sample.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Person pObj = (Person) ac.getBean("p1");
		System.out.println(pObj);
		
//		Person p1 = ac.getBean(Person.class); RTE two beans available, expected single
		Person pObj1 = ac.getBean("p2", Person.class);
		System.out.println(pObj1);
		
		Person pObj2 = ac.getBean("p2", Person.class);
		System.out.println(pObj2);
		
		System.out.println(pObj1 == pObj2);
		
		Person pObj3 = ac.getBean("p3", Person.class);
		System.out.println(pObj3);
		
		System.out.println("_____________________________________________");
		
		Employee eObj1 = ac.getBean("e1", Employee.class);
		System.out.println(eObj1);
	}
}
