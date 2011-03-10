package com.Chapter1.E1_5;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.beanutils.PropertyUtils;

public class Container {

private Map<String, Object> components;

public Container(){
	components = new HashMap<String, Object>();	

	try
	{
		Properties properties = new Properties();
		properties.load(new FileInputStream("C:\\eclipseg_workspace\\SpringRecipes\\src\\com\\Chapter1\\E1_5\\components.properties"));
		for(Map.Entry entry: properties.entrySet()){
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();
			processEntry(key,value);
	}
	}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
}
private void processEntry(String key, String value) throws Exception{
	String[] parts = key.split("\\.");
	if (parts.length == 1){
		Object component = Class.forName(value).newInstance();
		components.put(parts[0], component);
		
	}
	else{
		Object component = components.get(parts[0]);
		Object reference = components.get(value);
		PropertyUtils.setProperty(component, parts[1], reference);
	}
		
}

public Object getComponent(String key){
	return components.get(key);	
}


}
