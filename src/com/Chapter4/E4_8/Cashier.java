package com.Chapter4.E4_8;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class Cashier {
		private String name;
		private String path;
		private BufferedWriter writer;
		
		public void setName(String name) {
		this.name = name;
		}
	
		public void setPath(String path) {
		this.path = path;
		}
		
		public void openFile() throws IOException {
		File logFile = new File(path, name + ".txt");
		writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(logFile, true)));
		}
		
		public void checkout(ShoppingCart cart) throws IOException {
		double total = 0;
		for (Product product : cart.getItems()) {
		total += product.getPrice();
		}
		writer.write(new Date() + "\t" + total + "\r\n");
		writer.flush();
		}
		
		public void closeFile() throws IOException {
		writer.close();
		}
		}

