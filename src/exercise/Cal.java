package exercise;

import java.util.Date;
import java.util.Locale;

public class Cal {
public static void main(String args[]){
	CalendarBean cb=new CalendarBean();
	cb.setYear(2017);
	cb.setMonth(6);
	String a[]=cb.getCalendar();
	char str[]="��һ����������".toCharArray();
	for(char c:str){
		System.out.printf("%5c",c);//�����char������ռ5�У����ֽ����㣬ÿ���˵ĵ��Զ���һ����
	}
for(int i=0;i<a.length;i++){//�������a
	if(i%7==0)
		System.out.println(" ");//����
	System.out.printf("%4s",a[i]);//������ַ�������ռ4��
	
}
/**
String s=String.format(Locale.US, "%ta(%<tF)", new Date());
String t=String.format(Locale.JAPAN, "%ta(%<tF)", new Date());
String r=String.format("%tY��%<tm��%<td��", new Date());
System.out.println(s);
System.out.println(t);
System.out.println(r);
*/
}
}