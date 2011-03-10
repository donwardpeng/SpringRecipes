package com.Chapter1.E1_3;

public class ReportService {
	private ReportGenerator reportGenerator;
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
	
	public void setReportGenerator(ReportGenerator reportGenerator){
		this.reportGenerator = reportGenerator;
	}
	
	
}
