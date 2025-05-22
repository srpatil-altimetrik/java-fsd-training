package comd;

class D implements Runnable {
	public synchronized void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Demo_Synchronized {
	public static void main(String[] args) {
		D d = new D();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
		t1.setName("Ram");
		t2.setName("Seeta");
	}
}
