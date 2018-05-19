package Liu;

import java.io.*;

public class RandomL2 {
	public static void main(String args[]) {
		RandomAccessFile in=null;
		try {
			in=new RandomAccessFile("b.txt","rw");
			long length=in.length();//获取文件的长度
			long postion=0;
			in.seek(postion);//将读取位置定位到文件的起始位置
            while(postion<length) {
            	String str=in.readLine();//读取文件
            	byte b[]=str.getBytes("iso-8859-1");//用iso-8859-1重新编码,将str转化为字节数组
            	str=new String(b);//将字节数组转化为字符串
            	postion=in.getFilePointer();
            	System.out.println(str);
            }
		}catch(IOException e) {
	}
	}
}
