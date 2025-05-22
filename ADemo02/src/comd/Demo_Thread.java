package comd;

class A extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("	i : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread {
	public void run() {
		for (int j = 0; j <= 10; j++) {
			System.out.println("		j : " + j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class C extends Thread {
	public void run() {
		for (int k = 0; k <= 10; k++) {
			System.out.println("			k : " + k);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Demo_Thread {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.start();
		b.start();
		c.start();
	}
}
