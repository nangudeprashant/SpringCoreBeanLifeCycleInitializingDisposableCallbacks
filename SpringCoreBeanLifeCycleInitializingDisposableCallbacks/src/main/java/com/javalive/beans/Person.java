package com.javalive.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Administrator
 *
 */
public class Person implements InitializingBean,DisposableBean{
	 
	   private String name;
	   public Person()
	   {
	      System.out.println("Constructor of person bean is called !! ");
	   }
	   public void afterPropertiesSet() throws Exception // this is method of InitializingBean interface.
	   {
	   System.out.println("afterPropertiesSet method of person bean is called !! ");
	   }
	   public void destroy() throws Exception // this is method of DisposableBean interface.
	   {
	     System.out.println("destroy method of person bean is called !! ");
	   }
	   public String getName() {
	    return name;
	   }
	   public void setName(String name) {
	    this.name = name;
	   }
	}                