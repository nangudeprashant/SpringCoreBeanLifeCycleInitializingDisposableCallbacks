package com.javalive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javalive.beans.Person;

/**
 * InitalizingBean interface is defined under org.springframework.beans.factory
 * package and declares a single method where we can be used to add any
 * initialization related code. Any bean implementing InitalizingBean needs to
 * provide an implementation of afterPropertiesSet() method. Signature of method
 * is: void afterPropertiesSet() throws Exception;
 * 
 * Similarly DisposableBean interface is defined under the
 * org.springframework.beans.factory and declares a single method which gets
 * executed when bean is destroyed and can be used to add any cleanup related
 * code. Any bean implementing DisposableBean needs to provide an implementation
 * of destroy() method. Signature of method is : void destroy() throws
 * Exception;
 * 
 * This approach is simple to use but it’s not recommended because it will
 * create tight coupling with the Spring framework in our bean implementations.
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Person bean = (Person) context.getBean("personBean");
		System.out.println(bean.getName());
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
