package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String...args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Test t = (Test)ap.getBean("t");
		Test t1 =(Test)ap.getBean("t");
		System.out.println(t1==t);
		t.hello();
	}
}
