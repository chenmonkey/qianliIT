package exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class ClassInfor {
public static void main(String args[]){
	Date date=new Date();
	Class cs=date.getClass();
	String className=cs.getName();//获得类的名字
	Constructor[] con=cs.getDeclaredConstructors();//获得类的全部构造方法
	Field[] field=cs.getDeclaredFields();//获得类的全部成员变量
	Method[] method=cs.getDeclaredMethods();//获得类的全部方法

	System.out.println("类的名字:"+className);
	System.out.println("类有如下成员变量:");
	for(int i=0;i<field.length;i++)
		System.out.println(field[i].toString());
	System.out.println("类有如下方法:");
	for(int i=0;i<method.length;i++)
		System.out.println(method[i].toString());
	System.out.println("类有如下构造方法:");
	for(int i=0;i<con.length;i++)
		System.out.println(con[i].toString());
}

}
