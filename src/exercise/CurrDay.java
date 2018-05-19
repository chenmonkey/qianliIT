package exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrDay {
public static void main(String args[]){
	Date date=new Date();
	System.out.println(date);
	
	Calendar calendar=Calendar.getInstance();
	System.out.println(calendar.getTime());
	
	SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	System.out.println(sf.format(date));
	
	int year=calendar.get(Calendar.YEAR);
	int month=calendar.get(Calendar.MONTH);
	int today=calendar.get(Calendar.DAY_OF_MONTH);
	int weekDay=calendar.get(Calendar.DAY_OF_WEEK);
	int minute=calendar.get(Calendar.MINUTE);
	int second=calendar.get(Calendar.SECOND);
	System.out.println(year+"年"+(month+1)+"月"+today+"日"+"星期"+weekDay+minute+"分"+second+"秒");
}
}
