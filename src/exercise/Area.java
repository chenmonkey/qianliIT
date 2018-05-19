package exercise;

import java.util.Date;

class Rect {
	double area, height, width;
 
	public double getArea() {
		area = height*width;
		return area;
	}
	
}
public class Area {
	
	public static void main(String args[]) {

		try {
			Class cs = Class.forName("rl.Rect");
			Rect rect = (Rect) cs.newInstance();
			rect.height=200;
			rect.width=100;
			System.out.println("rect�����:" + rect.getArea());
			cs = Class.forName("java.util.Date");
			Date date = (Date) cs.newInstance();
			System.out.println(date.toString());
		} catch (Exception e) {

			System.out.println(e.toString());
		}
		
	}
}
