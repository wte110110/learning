package com.wte.le.spring;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class TestBean {
	/**
	 * bean的定义与注入
	 */
	@Test
	public void  springTest01() {
		ClassPathXmlApplicationContext  ctx= 	new ClassPathXmlApplicationContext("applicationContext-constructor-arg.xml");
		Person person = ctx.getBean("person", Person.class);
		Person person1 = ctx.getBean("person", Person.class);
		System.out.println(person);
		System.out.println(person1);
	}
	/**
	 * bean的构造器注入及属性注入
	 */
	@Test
	public void  springTest02() {
		ClassPathXmlApplicationContext  ctx= 	new ClassPathXmlApplicationContext("applicationContext-constructor-arg.xml");
		Person person = ctx.getBean("person", Person.class);
		System.out.println(person);
	}
	/**
	 * bean的别名
	 */
	@Test
	public void  springTest03() {
		ClassPathXmlApplicationContext  ctx= 	new ClassPathXmlApplicationContext("applicationContext-constructor-arg.xml");
		Person person = ctx.getBean("alias_person", Person.class);
		System.out.println(person);
	}
	/**
	 * bean注入：使用p-nameSpace
	 */
	@Test
	public void  springTest04(){
		ClassPathXmlApplicationContext  ctx= 	new ClassPathXmlApplicationContext("applicationContext-pnamespace.xml");
		Person person = ctx.getBean("person", Person.class);
		System.out.println(person);
	}
	/**
	 * bean的属性注入
	 */
	@Test
	public void  springTest05(){
		ClassPathXmlApplicationContext  ctx= 	new ClassPathXmlApplicationContext("applicationContext-property-di.xml");
		Person person = ctx.getBean("person", Person.class);
		System.out.println(person);
	}
}
