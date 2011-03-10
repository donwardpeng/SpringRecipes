package com.Chapter2.E2_4;

import java.util.List;

public class HelloWorld {
private String message;
private List<Holiday> holidays;



public void setHolidays(List<Holiday> holidays) {
	this.holidays = holidays;
}

public void setMessage(String message)
{
	this.message = message;
}
public void hello(){
	System.out.println("Hello " + message);
}
}
