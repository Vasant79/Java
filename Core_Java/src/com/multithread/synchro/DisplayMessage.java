package com.multithread.synchro;

public class DisplayMessage {

	void message(String name) {
		for (int i = 0; i < 6; i++) {
			System.out.println(i + " " + name);
		}
	}

}
