package com.jspiders.Multithreading.thread;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread1 is running");
		}
	}

}
