package com.Chapter4.E4_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception {
		ApplicationContext context =
		new ClassPathXmlApplicationContext("beans_Ch4_E4_8.xml");
		Product aaa = (Product) context.getBean("aaa");
		Product cdrw = (Product) context.getBean("cdrw");
		Product dvdrw = (Product) context.getBean("dvdr");
		ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
		cart1.addItem(aaa);
		cart1.addItem(cdrw);
		System.out.println("Shopping cart 1 contains " + cart1.getItems());
		ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");
		cart2.addItem(dvdrw);
		System.out.println("Shopping cart 2 contains " + cart2.getItems());
		Cashier cashier1 = (Cashier) context.getBean("cashier1");
		cashier1.checkout(cart1);
	}
}
