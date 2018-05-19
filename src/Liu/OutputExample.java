package Liu;

import java.io.*;

public class OutputExample {
	public static void main(String args[]){
		byte a[]="新年快乐".getBytes();
		byte b[]="happy new year".getBytes();
		File file=new File("b.txt");
		try{
			OutputStream out=new FileOutputStream(file);//OutputStream可以实现对象的多态性
			System.out.println(file.getName()+"的大小"+file.length()+"字节");
			out.write(a);
			out.close();
			//out=new FileOutputStream(file,true);//不刷新
			out=new FileOutputStream(file,false);//刷新
			System.out.println(file.getName()+"的大小"+file.length()+"字节");
			out.write(b, 0, b.length);
			System.out.println(file.getName()+"的大小"+file.length()+"字节");
			out.close();
		}
		catch(IOException e){
			System.out.println("Error:"+e);
		}
		
	}
}
