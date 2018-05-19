package Test;

public class Sub extends Base{
public String color;
public Sub(double size,String name,String color) {
	super(size,name);
	this.color=color;
}
public static void main(String args[]) {
	Sub s=new Sub(5.6,"皮卡丘","黄色");
	System.out.println(s.size+"--"+s.name+"--"+s.color);
}
}