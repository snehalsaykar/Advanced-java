package com.jspiders.Multithreading;

import com.jspiders.Multithreading.resource.Counter;
import com.jspiders.Multithreading.thread.MyThread4;

public class App3 {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();

		MyThread4 thread1 = new MyThread4(counter);
		MyThread4 thread2 = new MyThread4(counter);

		thread1.start();
		thread2.start();

		Thread.sleep(1000);

		System.out.println(counter.getCount());

	}

}
