package mutliThread;

public class Interview2 implements Runnable {
	int num = 0;

//	public Interview2(int i) {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String args[]) {
//		new Thread(new Interview2(1)).start();
		Interview2 iv = new Interview2();
		Thread t1 = new Thread(iv, "1");
		Thread t2 = new Thread(iv, "2");
		Thread t3 = new Thread(iv, "3");
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {

		while (num < 75) {

			if (num / 5 % 3 + 1 == Integer.parseInt(Thread.currentThread().getName())) {
				for (int i = 0; i < 5; i++) {
					System.out.println("线程" + Thread.currentThread().getName() + ":" + (++num));
				}

			}
		}
	}
}
