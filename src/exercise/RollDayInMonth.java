package exercise;


import java.util.Calendar;
import java.util.Date;

public class RollDayInMonth {
	public static void main(String args[]){
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		String s=String.format("%tF(%<tA)", calendar);
		System.out.println(s);
		int n=25;
		System.out.println("向后滚动（在月内)"+n+"天");
		calendar.roll(calendar.DAY_OF_MONTH, n);
		s=String.format("%tF(%<ta)", calendar);
		System.out.println(s);
		System.out.println("再向后滚动（在年内)"+n+"天");
		calendar.roll(calendar.DAY_OF_YEAR, n);
		s=String.format("%tF(%<ta)", calendar);
		System.out.println(s);
	}
}