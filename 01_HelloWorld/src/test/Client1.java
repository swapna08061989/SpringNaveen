package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client1 {

	@SuppressWarnings("unused")
	public static void main(String...args) {
		Resource r = new ClassPathResource("resources/spring.xml");
		BeanFactory f = new XmlBeanFactory(r);
		Test t = (Test)f.getBean("t");
		t.hello();
	}
}
