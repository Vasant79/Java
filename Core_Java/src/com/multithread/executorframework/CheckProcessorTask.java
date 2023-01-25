package com.multithread.executorframework;

public class CheckProcessorTask implements Runnable {

	String name;

	CheckProcessorTask(String name) {

		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " checking processor" + Thread.currentThread().getName());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("processor done" + Thread.currentThread().getName());
	}

}
