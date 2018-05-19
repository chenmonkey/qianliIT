package exercise;

import java.util.Calendar;


public class Text3 {
	public static void main(String args[]) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int today = calendar.get(Calendar.DAY_OF_MONTH);
		
		
		
		System.out.println(year + "年" + (month+1)+ "月" + today + "日");
		int maxDayOfMonth=calendar.getMaximum(Calendar.DAY_OF_MONTH);
		//System.out.println(maxDayOfMonth);
		
		int a[]=new int[42];
		char str[] = "日一二三四五六".toCharArray();
		for (char c : str) {
			System.out.printf(c+"\t");// 输出的char型数据占5列（以字节来算，每个人的电脑都不一样）
		}
		System.out.println();
		
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int weekDay=calendar.get(Calendar.DAY_OF_WEEK);
		//System.out.println(weekDay);
		
		for(int i=1;i<weekDay;i++)
			System.out.print("\t");
		
		for(int j=1;j<=maxDayOfMonth-1;j++){
			
			a[j]=j;
			System.out.print(a[j]+"\t");
		if((j+weekDay-1)%7==0)
			System.out.println();
		
		
			
		}
	}
}
