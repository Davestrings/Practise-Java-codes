package examples;

import java.security.SecureRandom;

public class Consumer implements Runnable {
	private static final SecureRandom generator = new SecureRandom();
	private final Buffer sharedLocation;
	
	public Consumer(Buffer sharedLocation) {
		this.sharedLocation = sharedLocation;
	}

	@Override
	public void run() {
		int sum = 0;
		
		for(int count = 1; count <= 10; count++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sum += sharedLocation.blockingGet();
//				System.out.printf("\t\t\t%2d%n", sum);// I/O should not be performed in a thread. This helps reduce the waiting time of the thread
			}catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.printf("%n%s %d%n%s%n", "Consumer read values totalling", sum, "Terminating Consumer...");
	}

}
