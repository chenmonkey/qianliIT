package mutliThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 * 通过Callable和Future来创建线程
 */
public class Test3 implements Callable<Integer>{

	/*
	 *执行线程
	 */
	public Integer call() throws Exception {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		return null;
	}
public static void main(String args[]) {
	Test3 t=new Test3();
	FutureTask<Integer> ft=new FutureTask<>(t);//用FutureTask类来包装Callable对象
    for(int i=0;i<10;i++) {
    	System.out.println(Thread.currentThread().getName()+"的循环变量i的值"+i);
         if(i==2) {
        	 new Thread(ft,"有返回值的线程").start();
         }
    }
    try {
    	System.out.println("子线程的返回值:"+ft.get());
    }catch(InterruptedException e) {
    	e.printStackTrace();
    } catch (ExecutionException e) {
		
		e.printStackTrace();
	}
}
}

