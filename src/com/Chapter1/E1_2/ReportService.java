package com.Chapter1.E1_2;

public class ReportService {
	private ReportGenerator reportGenerator = ServiceLocator.getReportGenerator();
	public void generateAnnualReport(int year)
	{
	String[][] myTable = null;
	reportGenerator.generate(myTable);
	}
	
	public void generateMonthlyReport(int year, int month){
		String[][] myTable = null;
		reportGenerator.generate(myTable);
		
	}
	public void generateDailyReport(int year, int month, int day)
	{
		String[][] myTable = null;
		reportGenerator.generate(myTable);
		
	}
	
	
}
