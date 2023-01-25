package com.multithread;

public class MultiThreadDemo implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 11; i++) {
			System.out.print(" " + i);

		}

	}

	public static void main(String[] args) {

		MultiThreadDemo mt = new MultiThreadDemo();

		Thread t1 = new Thread(mt); // takes runnable as argument
		Thread t2 = new Thread(mt);

		// thread names

		System.out.println(Thread.currentThread());

		t1.setName("thread v");
		System.out.println(t1.getName());

		System.out.println("thread 3 : " + t2.getName());

		// start method can be used on thread class not runnable interface

		t1.start();

		for (int j = 0; j < 11; j++) {
			System.out.print(" " + j);
		}
	}

}
