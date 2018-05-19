package mutliThread;

public class Text2 {
	public static void main(String args[]){
		Thread speakElephant;//Thread声明线程
		Thread speakCar;//Thread声明线程
		
		SpeakElephant elephant=new SpeakElephant();//创建目标对象elephant
		SpeakCar car=new SpeakCar();//创建目标对象car
		
		speakElephant=new Thread(elephant);//创建线程，目标对象是elephant
		speakCar=new Thread(car);//创建线程，目标对象是car
		
		
		
		speakElephant.start();//启动线程
		
		speakCar.start();//启动线程
		
		for(int i=1;i<=15;i++) {
			System.out.print("主人"+i+" ");
		}
	}
}

