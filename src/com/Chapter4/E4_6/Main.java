package com.Chapter4.E4_6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception {
		ApplicationContext context =
		new ClassPathXmlApplicationContext("beans_Ch4_E4_6.xml");		
		Product bestSeller = (Product) context.getBean("bestSeller");
		System.out.println(bestSeller);
		}
}
