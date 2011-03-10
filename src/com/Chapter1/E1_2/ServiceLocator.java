package com.Chapter1.E1_2;

public class ServiceLocator {
private static Container container = Container.instance;

public static ReportGenerator getReportGenerator(){
	return (ReportGenerator)container.getComponent("reportGenerator"); 
}

}
