package practice;

public class Dog extends Animal{
	
	@Override
	public void cry() {
		
		String voice="wangwang";
		System.out.println("狗叫"+voice);
	}
	

	@Override
	public String getAnimalName() {
	return "dog";
	}



}
