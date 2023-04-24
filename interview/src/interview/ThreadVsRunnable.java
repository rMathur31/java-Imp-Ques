package interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.corba.se.impl.orbutil.closure.Future;

//now it cannot extend any other class - multiinheritanc not allowed
class MyThread extends Thread{
	public void run() {
		System.out.println("Inside thread");
	}
}

//now it can extend any other class also
class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Inside Runnable");
	}
}

class MyCallable implements Callable<Integer>{
	
/*	The Callable interface is similar to Runnable, 
 * in that both are designed for classes whoseinstances are potentially executed by another thread.
 *  A Runnable, however, does not return a result and cannotthrow a checked exception
*/
	@Override
	public Integer call() throws Exception {
		System.out.println("Inside Callable");
		return 101;
	}
	
}

public class ThreadVsRunnable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyThread thread1 = new MyThread();
		thread1.start();
		
		MyRunnable runObj = new MyRunnable();
		Thread thread2 = new Thread(runObj);
		//if we cann run directly it will run on same thread1 not on thread2
		thread2.start();
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		java.util.concurrent.Future<Integer> future = executor.submit(new MyCallable());
		System.out.println(future.get());
		
		
	}
}
