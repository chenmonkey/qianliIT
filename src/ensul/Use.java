package ensul;

public class Use { 
	int age;
	public static void main(String args[]) {
		Display.display("封装");
		
		Users users=new Users();
		users.setUsername("陈梦琪");

		Use use=new Use();
		use.setAge(22);
		
		System.out.println(users.getUsername());
		System.out.println(use.getAge());
	}

	private void setAge(int age) {

		this.age=age;
	}

	private int getAge() {
		return age;
	}
	}
