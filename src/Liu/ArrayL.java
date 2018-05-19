package Liu;

import java.io.*;

public class ArrayL {
	public static void main(String args[]) {
		try {
			//字节数组输入输出流
			ByteArrayOutputStream outByte=new ByteArrayOutputStream();
			byte byteContent[]="mid-autumn festival".getBytes();//将字符串转化为字节数组
			outByte.write(byteContent);//将字节数组写入字节数组输出流
			ByteArrayInputStream inByte=new ByteArrayInputStream(outByte.toByteArray());
			byte backByte[]=new byte[outByte.toByteArray().length];
			inByte.read(backByte);
			System.out.println(new String(backByte));//将字节数组转化为字符串
			
			//字符数组输入输出流
			CharArrayWriter outChar=new CharArrayWriter();
			char charContent[]="中秋节".toCharArray();//将字符串转化为字符数组
			outChar.write(charContent);
			CharArrayReader inChar=new CharArrayReader(outChar.toCharArray());
			char backChar[]=new char[outChar.toCharArray().length];
			inChar.read(backChar);
			System.out.println(new String(backChar));
			
		}
		catch(IOException e) {
			
		}
	}

}
