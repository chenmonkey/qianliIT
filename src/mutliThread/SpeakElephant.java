package mutliThread;

public class SpeakElephant extends Thread{
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.print("小汽车"+i+" ");
		}
	}
}
