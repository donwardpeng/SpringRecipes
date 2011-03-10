package com.Chapter1.E1_4;

import java.util.HashMap;
import java.util.Map;

public class Container {

private Map<String, Object> components;

public Container(){
	components = new HashMap<String, Object>();	

	//Add Components
	ReportGenerator pdfGen = new PdfGenerator();
	components.put("reportGenerator", pdfGen);
	ReportService repService = new ReportService(pdfGen);
	components.put("reportService", repService);
}

public Object getComponent(String key){
	return components.get(key);	
}


}
