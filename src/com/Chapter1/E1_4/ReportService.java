package com.Chapter1.E1_4;

public class ReportService {
	private ReportGenerator reportGenerator;
	
	public ReportService(ReportGenerator pdfGen) {
		this.reportGenerator = pdfGen;
	}
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
