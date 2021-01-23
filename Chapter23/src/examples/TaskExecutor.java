package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {

	public static void main(String[] args) {
		PrintTask task1 = new PrintTask("Task1");
		PrintTask task2 = new PrintTask("Task2");
		PrintTask task3 = new PrintTask("Task3");
		
		System.out.println("Starting Executor");
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		//start the three PrintTasks
		executorService.execute(task1);
		executorService.execute(task2);
		executorService.execute(task3);
		
		//shut down ExecutorService-- it decides when to shut down threads
		executorService.shutdown();
		
		System.out.printf("Tasks started, main ends.%n%n");
	}

}
