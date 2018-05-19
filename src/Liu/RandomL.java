package Liu;

import java.io.*;

//用RandomAccessFile流（随机流）讲几个int型整数写入到english.txt文件中
public class RandomL {
	public static void main(String args[]) {
		RandomAccessFile inAndOut=null;
		int date[]= {1,2,3,4,5,6};
		try {
			inAndOut=new RandomAccessFile("a.txt","rw");
			for(int i=0;i<date.length;i++) {
				inAndOut.writeInt(date[i]);
			}
			for(int i=date.length-1;i>=0;i--) {
				inAndOut.seek(i*4);
				
				System.out.printf("\t%d",inAndOut.readInt());//readInt()从文件中读取一个int值（4个字节）
			}
			inAndOut.close();
		}
		catch(IOException e) {
			
		}
	}

}

