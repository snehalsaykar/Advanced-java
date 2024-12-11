package com.jspiders.Multithreading.thread;

import com.jspiders.Multithreading.resource.Counter;

public class MyThread4 extends Thread {

	private Counter counter;

	public MyThread4(Counter counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100000; i++) {
			counter.increment();
		}
	}

}