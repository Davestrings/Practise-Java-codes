package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest2 {

	public static void main(String[] args) {
		ExecutorService  executor = Executors.newCachedThreadPool();
		
		Buffer sharedLocation = new SyschronizedBuffer();
		
		System.out.printf("%-40s%s\t\t%s%n%-40s%s%n%n", "Operation",
				"Buffer", "Occupied", "---------", "------\t\t--------");

		// execute the Producer and Consumer tasks
		executor.execute(new Producer(sharedLocation));
		executor.execute(new Consumer(sharedLocation));
		
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
