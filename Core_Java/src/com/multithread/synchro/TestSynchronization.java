package com.multithread.synchro;

public class TestSynchronization {

	public static void main(String[] args) {

		DisplayMessage dm = new DisplayMessage();

		MyThread t1 = new MyThread(dm, "Vasant");
		MyThread t2 = new MyThread(dm, "Negi");

		// thread will not start until you invoke start();
		t1.start();
		t2.start();
	}

}
