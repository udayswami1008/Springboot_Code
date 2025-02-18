package com.nt.sbean;
import java.time.LocalDate;
public class currentseasonefinder 
{
private LocalDate date;

public void setDate(LocalDate date)
{
	this.date=date;
}
public String showseassion()
{
	int month= date.getMonthValue();
	if(month>=3&& month<=6)
		return "summer :: " + month + "::"+date.getMonth()+"::"+date.getYear();
	
	else if (month>=7 & month <= 10)
		return "rainy ::" + month + "::"+date.getMonth()+"::"+date.getYear();
	
	else
		return "winter::" + month + "::"+date.getMonth()+"::"+date.getYear();
}
}
	
