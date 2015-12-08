/*
 * This program is assignment 6 in CSC 200
 * author: Christopher O'Brien
 * 
 */

public class Day 
{
	//G: Constructors
	private String day;
	private String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	public Day(String day) {
		super();
		this.day = day;
	}
	
	//A and C: Get and set the day that the user wants to start with
	public String getDay() {
		return day;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	//D: return the next day
	public String nextDay() 
	{
		String message = "";
		int dayIndex = getDayIndex(this.day);
		if (dayIndex==6)
		{
			message = days[dayIndex-6];
		}
		else if(dayIndex!=-1)
		{
			message = days[dayIndex+1];
		}
		else
		{
			message = "Invalid Day!";
		}
		return message;
	}	
	
	//E: return the previous day
	public String previousDay()
	{
		String message = "";
		int dayIndex = getDayIndex(this.day);
		if (dayIndex ==0)
		{
			message = days[dayIndex+6];
		}
		else if (dayIndex!=-1)
		{
			message = days[dayIndex-1];
		}
		else
		{
			message = "Invalid Day!";
		}
		return message;
	}
	//F: Add a number of days to the specified day and calculate what day it will be
	public String chooseDay(int numDays)
	{
		
		String message = "";
		int dayIndex = getDayIndex(this.day);
		dayIndex = (dayIndex + numDays)%7;
		message = days[dayIndex];
		
		return message;
	}
	private int getDayIndex(String day)
	{
		for(int index=0; index<days.length; index++){
			if (days[index] == this.day){
				return index;
			}
		}
		
		return -1;
	}
	//B: prints the day output
	@Override
	public String toString() {
		return "Day [day=" + day + "]";
	}
	



}
