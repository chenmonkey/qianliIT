package practice;
//利用String类的方法，用自定义带参方法，对文件名进行判断是否是java文件或者class文件，如果是，就输出文件类型，如果不是就输出文件名错误
public class Text5 {
public static void main(String args[]){
	
		String fileName1="aaa.java";
		String prefix=fileName1.substring(fileName1.lastIndexOf(".")+1);
		if((fileName1.endsWith("java")||fileName1.endsWith("class"))&&fileName1.indexOf(".")!=-1)
			System.out.println("文件类型是"+prefix+"文件");
		else
			System.out.println("文件名错误");
}
}
