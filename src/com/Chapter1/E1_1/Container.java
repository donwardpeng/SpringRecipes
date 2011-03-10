package com.Chapter1.E1_1;

import java.util.HashMap;
import java.util.Map;

public class Container {
public static Container instance;
private Map<String, Object> components;

public Container(){
	instance = this;
	components = new HashMap<String, Object>();	

	//Add Components
	components.put("reportGenerator", new PdfGenerator());
	components.put("reportService", new ReportService());
}

public Object getComponent(String key){
	return components.get(key);	
}


}
