package mutliThread;

import java.util.Date;

public class Interview1 implements Runnable{
    
    public static void main(String args[]) throws InterruptedException {
       Interview1 iv=new Interview1();
    	Thread A=new Thread(iv,"A");
        Thread B=new Thread(iv,"B");
        Thread C=new Thread(iv,"C");
        A.start();
        A.join();
        B.start();
        B.join();
        C.start();
        
    }
	@Override
	public void run() {
		System.out.println("线程"+Thread.currentThread().getName()+":开始运行"+new Date());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("线程"+Thread.currentThread().getName()+":结束运行"+new Date());
		
	}

}
