package practice;

public class Text3 {
	Student student[] = new Student[3];

	public void a() {
		String snoo[] = { "1", "2", "3" };
		String namee[] = { "一", "二", "三" };
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
			student[i].sno = snoo[i];
			student[i].name = namee[i];
			System.out.println(student[i].sno + "\t" + student[i].name);

		}
	}

	public static void main(String args[]) {
		Text3 text = new Text3();
		text.a();
	}
}
