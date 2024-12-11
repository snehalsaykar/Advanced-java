package com.jspiders.Multithreading;

import com.jspiders.Multithreading.resource.Resource;
import com.jspiders.Multithreading.thread.MyThread5;
import com.jspiders.Multithreading.thread.MyThread6;

public class App5 {

	public static void main(String[] args) {

		Resource resource1 = new Resource();
		Resource resource2 = new Resource();

		MyThread5 thread1 = new MyThread5(resource1, resource2);
		thread1.setName("Thread-1");
		thread1.setPriority(1);

		MyThread6 thread2 = new MyThread6(resource1, resource2);
		thread2.setName("Thread-2");
		thread2.setPriority(10);

		thread1.start();
		thread2.start();

	}

}
