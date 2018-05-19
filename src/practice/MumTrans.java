package practice;

import java.util.Scanner;

public class MumTrans {
public static void main(String args[]){
	
	String a[]={"fu","ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
	Scanner scan=new Scanner(System.in);
	String num=scan.nextLine();
	
String c[]={"-","0","1","2","3","4","5","6","7","8","9"};
	char b[]=num.toCharArray();

		
for(int i=0;i<b.length;i++){
		c[i]=a[i];
		
	if(b[i]=='-')
		System.out.print(a[0]+" ");
		if(b[i]=='0')
			System.out.print(a[1]+" ");
		if(b[i]=='1')
			System.out.print(a[2]+" ");
		if(b[i]=='2')
			System.out.print(a[3]+" ");
		if(b[i]=='3')
			System.out.print(a[4]+" ");
		if(b[i]=='4')
			System.out.print(a[5]+" ");
		if(b[i]=='5')
			System.out.print(a[6]+" ");
		if(b[i]=='6')
			System.out.print(a[7]+" ");
		if(b[i]=='7')
			System.out.print(a[8]+" ");
		if(b[i]=='8')
			System.out.print(a[9]+" ");
		if(b[i]=='9')
			System.out.print(a[10]+" ");
}
}
}
