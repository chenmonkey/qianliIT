package practice;

public class Text1 {
	public static void main(String args[]) {
		int a[] = new int[100];
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				a[i] = 100 - i;
				System.out.print(a[i] + "\t");
			}
		}
	}
}
