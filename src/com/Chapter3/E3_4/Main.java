package com.Chapter3.E3_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_Ch3_E3_4.xml");
		SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator");
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());

	}

}
