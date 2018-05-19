package Liu;

import java.io.*;

public class DataL {
	public static void main(String args[]) {
		File file=new File("b.txt");
		try {
			FileOutputStream fout=new FileOutputStream(file);
			DataOutputStream dout=new DataOutputStream(fout);
			dout.writeInt(100);
			dout.writeChars("how are you doing");
			
			FileInputStream fin=new FileInputStream(file);
			DataInputStream din=new DataInputStream(fin);
			System.out.println(din.readInt());
			char c='\0';
			while((c=din.readChar())!='\0') {
				System.out.print(c);
			}
			
		}
		catch(IOException e) {
			
		}
}
}