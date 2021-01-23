package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingBufferTest {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Buffer sharedLocation = new BlockingBuffer();
		
		executor.execute(new Producer(sharedLocation));
		executor.execute(new Consumer(sharedLocation));
		
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}
