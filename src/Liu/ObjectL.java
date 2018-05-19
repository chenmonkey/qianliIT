package Liu;

import java.io.*;

public class ObjectL {
public static void main(String args[])  {
	TV tv=new TV();
	tv.setName("长虹电视");
	tv.setPrice(5478);
	File file=new File("television.txt");
	try {
		FileOutputStream fout=new FileOutputStream(file);
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		oout.writeObject(tv);
		oout.close();
		
		FileInputStream fin=new FileInputStream(file);
		ObjectInputStream oin=new ObjectInputStream(fin);
		TV fx=new TV();
		oin.readObject();
		//TV fx=(TV)oin.readObject();
		oin.close();
		fx.setName("新飞电视");
		fx.setPrice(5412);
		
		System.out.println("长虹的名字:"+tv.getName());
		System.out.println("长虹的价格:"+tv.getPrice());
		System.out.println("新飞的名字:"+fx.getName());
		System.out.println("新飞的名字:"+fx.getPrice());
	}
	catch(ClassNotFoundException e) {
		System.out.println("不能读出对象");
	}
	catch(IOException e) {
		
	}
}
}
