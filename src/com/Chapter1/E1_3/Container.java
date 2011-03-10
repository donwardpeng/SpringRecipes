package com.Chapter1.E1_3;

import java.util.HashMap;
import java.util.Map;

public class Container {

private Map<String, Object> components;

public Container(){
	components = new HashMap<String, Object>();	

	//Add Components
	ReportGenerator pdfGen = new PdfGenerator();
	components.put("reportGenerator", pdfGen);
	ReportService repService = new ReportService();
	components.put("reportService", repService);
	//set the ReportService generator
	repService.setReportGenerator(pdfGen);
}

public Object getComponent(String key){
	return components.get(key);	
}


}
