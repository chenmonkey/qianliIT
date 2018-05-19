package mutliThread;

public class Interview3 implements Runnable{
	 private  int tick = 10;
	    Object obj = new Object();
	    boolean flag = true;

	@Override
	public void run() {
	     if(flag)
	        {
	            while(true)
	            {
	                synchronized(this)  
	                {
	                    if(tick>0)
	                    {
	                        try{Thread.sleep(10);}catch(Exception e){}
	                        System.out.println(Thread.currentThread().getName()+"....code : "+ tick--);
	                    }
	                }
	            }
	        }
	        else
	            while(true)
	                show();           
		
	}

	private void show() {
		 if(tick>0)
	        {
	            try{Thread.sleep(10);}catch(Exception e){}
	            System.out.println(Thread.currentThread().getName()+"....show.... : "+ tick--);
	        }
	    }
	public static void main(String[] args) 
    {

		Interview3 t = new Interview3();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t.flag = false;
        t2.start();

	}

}
