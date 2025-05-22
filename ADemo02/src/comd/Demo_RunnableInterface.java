package comd;

class X implements Runnable {
	public void run() {
		for (int i = 0; i <= 25; i++) {
			if (Thread.currentThread().getName().equals("Thread-1")) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
			if (Thread.currentThread().getName().equals("Thread-2")) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Demo_RunnableInterface {
	public static void main(String[] args) {
		X a = new X();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		t1.start();
		t2.start();
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t1.setPriority(8);
		t2.setPriority(3);
		System.out.println(t1);
		System.out.println(t2);

		for (int j = 0; j <= 25; j++) {

			try {
				System.out.println("        " + j);
				if (j == 10) {
					t1.suspend();
				}
				if (j == 20) {
					t1.resume();
				}
				if (j == 13) {
					t1.stop();
				}
				if (j == 15) {
					System.out.println("Thread-1" + t1.isAlive());
				}
				if (j == 10) {
					System.out.println("Thread-2" + t2.isAlive());
				}
				if (j == 15) {
					System.out.println("Thread-2" + t2.isAlive());
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}
