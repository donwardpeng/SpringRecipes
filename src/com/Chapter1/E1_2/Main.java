package com.Chapter1.E1_2;

public class Main {


	public static void main(String[] args) {
		Container container = new Container();
		ReportService reportService = (ReportService)container.instance.getComponent("reportService");
		reportService.generateDailyReport(2007, 5, 10);	
	}
}
