package practice;

import java.util.Scanner;

public class Text2 {
	public static void main(String args[]) {
		int a[] = { 1, 5, 7, 15, 23, 6, 45, 0 };
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		//int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (b == a[i]) {
				//c = b;
				//System.out.println(c);
				System.out.println(b);
				return;
			}
		}

		//if (c == 0)
			System.out.println(-1);
		
	}
}
