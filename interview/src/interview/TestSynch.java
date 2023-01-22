package interview;


class Counter{
	int count;
	public synchronized void increment() {
		count++;
	}
}
public class TestSynch {

	//not synchronized
	transient int x = 10;
	
	//multiple threads will work on it -> write before read
	volatile int y = 20;
	
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});
		t1.start();
		//asking main to wait
		t1.join();

		t2.start();
		//asking main to wait
		t2.join();
		System.out.println(c.count);
	}
}
