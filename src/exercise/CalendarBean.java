package exercise;

import java.util.Calendar;

public class CalendarBean {
int year=0,month=0;
	public void setYear(int year) {
		this.year=year;
		
	}
	public void setMonth(int month) {
		this.month=month;
		
	}
	public String[] getCalendar() {
		String a[]=new String[42];
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, month-1,1);//����������(�մ�1����)
	    int weekDay=calendar.get(Calendar.DAY_OF_WEEK)-1;//�����һ�ŵ�����
	    int day=0;
	    if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
	    	day=31;
	    if(month==4||month==6||month==9||month==11)
	    	day=30;
	    if(month==2){
	    	if(((year%4==0)&&(year%100!=0))||(year%400==0))
	    		day=29;
	    	else
	    		day=28;
	    }
		for(int i=0;i<weekDay;i++)
			a[i]=" ";//һ��֮ǰ���ǿ��ַ�
		for(int i=weekDay,n=1;i<weekDay+day;i++){
			a[i]=String.valueOf(n);//n��һ����������һ���������Բ�����toString
			n++;
		}
		for(int i=weekDay+day;i<a.length;i++)
			a[i]=" ";//6�����һ��֮���ǿ��ַ�
		return a;
	}
	
}
