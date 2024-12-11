package com.jspiders.Multithreading;

import com.jspiders.Multithreading.thread.MyThread1;
import com.jspiders.Multithreading.thread.MyThread2;

public class App1 {

	public static void main(String[] args) {

		MyThread1 thread1 = new MyThread1();
		new Thread(thread1).start();

		MyThread2 thread2 = new MyThread2();
		thread2.start();

	}

}
