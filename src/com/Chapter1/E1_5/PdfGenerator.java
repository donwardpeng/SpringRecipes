package com.Chapter1.E1_5;

public class PdfGenerator implements ReportGenerator {

	@Override
	public void generate(String[][] table) {
		System.out.println("In PDF Report Generator");
	}

}
