package com.wte.le.spring;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
	/**
	 * bean的定义与注入
	 */
	@Test
	public void  springTest01() {
		ClassPathXmlApplicationContext  ctx= 	new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = ctx.getBean("person", Person.class);
		Person person1 = ctx.getBean("person", Person.class);
		Person person2= ctx.getBean("person", Person.class);
		Person person3 = ctx.getBean("person", Person.class);
		System.out.println(person);
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}
	/**
	 * bean的构造器注入及属性注入
	 */
	@Test
	public void  springTest02() {
		ClassPathXmlApplicationContext  ctx= 	new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = ctx.getBean("person", Person.class);
		System.out.println(person);
	}
	/**
	 * bean的别名
	 */
	@Test
	public void  springTest03() {
		ClassPathXmlApplicationContext  ctx= 	new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = ctx.getBean("alias_person", Person.class);
		System.out.println(person);
	}
}
