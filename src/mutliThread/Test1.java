package mutliThread;

/*
 * 通过实现runnable接口来创建线程
 */
class RunnableDemo implements Runnable{
    private Thread t;//申明私有线程对象t
    private String threadName;//申明私有字符串threadName
    /*
     * 有一个参数的构造方法
     */
    RunnableDemo(String name){
    	this.threadName=name;
    	System.out.println("Creating"+threadName);
    }
	/*
	 * 线程运行
	 */
	public void run() {
		System.out.println("Running"+threadName);
		try {
			for(int i=4;i>0;i--) {
				System.out.println("Thread:"+threadName+","+i);
				Thread.sleep(50);//让线程休眠一会
			}
		}catch(InterruptedException e) {
			System.out.println("Thread:"+threadName+"interrupted.");
		}
		System.out.println("Thread:"+threadName+"exiting.");
	}
	/*
	 * 线程就绪
	 */
	public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

public class Test1 {
public static void main(String args[]) {
	RunnableDemo R1=new RunnableDemo("Thread-1");
	R1.start();//调用start方法，实线程就绪
	RunnableDemo R2=new RunnableDemo("Thread-2");
	R2.start();
}
}
