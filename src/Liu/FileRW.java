package Liu;

import java.io.*;

public class FileRW {
	public static void main(String args[]){
		File sourceF=new File("d.txt");
		File targetF=new File("Monkey.txt");
		char ee[]=new char[20];
		try{
			Writer out=new FileWriter(targetF,true);//指向目的地的输出流
			Reader in=new FileReader(sourceF);//指向源的输入流
			int n=-1;
			while((n=in.read(ee))!=-1){
				out.write(ee,0,n);
			}
			out.flush();//立刻冲洗缓冲区，即将当前缓冲区的内容写入到目的地
			out.close();
			
		}
		catch(IOException e){
			System.out.println("Error:"+e);
		}
	}
}
