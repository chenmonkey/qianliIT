package mutliThread;

public class Text1 {
	public static void main(String args[]){
		SpeakElephant elephant;
		SpeakCar car;
		elephant=new SpeakElephant();//创建线程
		car=new SpeakCar();//创建线程
		elephant.start();//启动线程
		
		car.start();//启动线程
		
		for(int i=1;i<=15;i++) {
			System.out.print("主人"+i+" ");
		}
	}
	}
