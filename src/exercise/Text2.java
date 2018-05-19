package exercise;


public class Text2 {
	public static void main(String args[]) {
		String str = new String("苹果");
		modify(str);
		System.out.println(str);
	}

	private static void modify(String s) {
		s = s + "好吃";
		System.out.println(s);
	}
}

