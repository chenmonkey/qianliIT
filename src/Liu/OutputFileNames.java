package Liu;

import java.io.*;
public class OutputFileNames {
public static void main(String args[]) throws IOException{
	
	int n=-1;
	byte []b=new byte[10];
	File file3=new File("D:\\学习相关\\STS代码\\qianliIT\\src\\Liu\\FileAccept.java");

	try{
		FileInputStream in=new FileInputStream(file3);
	    while((n=in.read(b,0,100))!=-1){
		   String s=new String(b,0,n);
		   System.out.println(s);
	}
	in.close();
	}catch(IOException e){
		System.out.println("File read Error"+e);
	}
}
}
