package com.Chapter4.E4_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception {
		ApplicationContext context =
		new ClassPathXmlApplicationContext("beans_Ch4_E4_2.xml");		
		Product aaa = (Product) context.getBean("aaa");
		Product cdrw = (Product) context.getBean("cdrw");
		System.out.println(aaa);
		System.out.println(cdrw);
		}
}
