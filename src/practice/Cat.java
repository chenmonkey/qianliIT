package practice;

public class Cat extends Animal{

	@Override
	public void cry() {
		String voice="miao,miao";
		System.out.println("猫叫"+voice);
	}
	@Override
	public String getAnimalName() {
		
		return "cat";
	}
	
	
	
}
