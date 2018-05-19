package Liu;

import java.io.*;
import java.util.*;

public class BufferedRW {
public static void main(String args[]){
	File file1=new File("english.txt");
	File file2=new File("englishCount.txt");
	try{
		Reader in=new FileReader(file1);
		Writer out=new FileWriter(file2);
		BufferedReader fin=new BufferedReader(in);
		BufferedWriter fout=new BufferedWriter(out);
		String s="";
		
		while((s=fin.readLine())!=null){//将english.txt存入字符串中
			StringTokenizer fx=new StringTokenizer(s);//字符串分析器,
			//默认的分隔符是空格符，制表符，换行符、回车符
			int count=fx.countTokens();
			s=s+"句子中的单词个数:"+count;
			fout.write(s);//将字符串s写入englishCount中
			fout.newLine();
		}
		fout.close();
		fin.close();
		System.out.println(file2.getName()+"内容");
		in=new FileReader(file2);
		fin=new BufferedReader(in);
		while((s=fin.readLine())!=null){
			System.out.println(s);
		}
		
	}
	catch(IOException e){
		System.out.println("Error:"+e);
	}
	
}
}
