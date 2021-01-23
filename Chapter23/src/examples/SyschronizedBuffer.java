package examples;

public class SyschronizedBuffer implements Buffer{
	private int buffer = -1; // shared by producer and consumer threads
	private boolean occupied = false;

	@Override
	public synchronized void blockingPut(int value) throws InterruptedException {
		// while there are no empty locations, place threads in waiting state
		while(occupied) {
			System.out.println("Producer tries to write."); //for demo only
			displayState("Buffer full. Producer waits."); // demo only
			wait();
		}
		buffer = value;// set new buffer value
		
		//indicate producer cannot store another value
		// until consumer retrieves current buffer value
		occupied = true;
		displayState("Producer writes" + buffer);
		notifyAll();
		
	}

	@Override
	public synchronized int blockingGet() throws InterruptedException {
		while(!occupied) {
			System.out.println("Consumer tries to read."); // for demo only
			displayState("Buffer empty. Conumer waits.");// for demo only
			wait();
		}
		occupied = false;
		displayState("Consumer reads" + buffer);
		return 0;
	}

	private synchronized void displayState(String operation) {
		System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer,
				 occupied);
		
	}
}
