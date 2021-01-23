package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest {

	public static void main(String[] args) {
		//create new thread pool 
		ExecutorService executor = Executors.newCachedThreadPool();
		
		//create unsynchronizedBuffer to store integer values
		Buffer sharedLocation = new UnsynchronizedBuffer();
		
		System.out.println("Action\t\tValue\tSum of Produced\tSum of Consumed");
		System.out.printf("------\t\t-----\t----------------\t----------------%n%%n");
		
		//execute the producer and consumer, giving each access to
		// the sharedLocation
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
