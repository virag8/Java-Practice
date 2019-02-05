package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Excute {

	public static void main(String[] args) {

		// BeanFactory b = new ClassPathXmlApplicationContext("Bean.xml");

		ApplicationContext context1 = new ClassPathXmlApplicationContext("Bean.xml");

		ApplicationContext context2 = new AnnotationConfigApplicationContext(SpringConfig.class);

//		Student std1 = context1.getBean("student", Student.class);
//
//		System.out.println(std1.getAddress().toString());
//
//		Student std2 = context2.getBean("student", Student.class);
//
//		System.out.println(std2.getAddress().toString());
		Car car = context1.getBean("car", Car.class);
		System.out.println(car.toString());

	}

}
