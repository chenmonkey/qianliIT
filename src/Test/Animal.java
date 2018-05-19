package Test;

public class Animal extends Creature{
	public Animal(String name) {
		
		//子类构造器中既无super调用，也无this调用，则隐式调用父类中无参数的构造器
		System.out.println("Animal带一个参数的构造器，"+"该动物的name为"+name);
	}
	public Animal(String name,int age) {
		//使用this调用同一个重载的构造器，系统会根据this里的实参列表调用本类中的另一个构造器
		this(name);
		System.out.println("Animal带两个参数的构造器，"+"该动物的age为"+age);
	}
	}