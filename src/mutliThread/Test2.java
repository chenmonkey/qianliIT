package mutliThread;

/*
* 通过继承Thread类来创建线程
*/
class RunnableD extends Thread{
	 private Thread t;//申明私有线程对象t
	    private String threadName;//申明私有字符串threadName
	    /*
	     * 带一个参数的构造方法
	     */
	    RunnableD(String name){
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
					//让线程休眠一会
					Thread.sleep(50);
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

	public class Test2 {
	public static void main(String args[]) {
		RunnableD R1=new RunnableD("Thread-1");
		R1.start();
		RunnableD R2=new RunnableD("Thread-2");
		R2.start();
	}
	}