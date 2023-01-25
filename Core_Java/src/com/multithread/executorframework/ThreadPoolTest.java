package com.multithread.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {

		CheckProcessorTask[] cpt = { new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Online") };

		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (CheckProcessorTask checking : cpt) {

			executor.submit(checking);
		}

		executor.shutdown();
	}
}
