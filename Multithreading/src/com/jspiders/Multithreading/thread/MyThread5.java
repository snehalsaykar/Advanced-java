package com.jspiders.Multithreading.thread;

import com.jspiders.Multithreading.resource.Resource;

public class MyThread5 extends Thread {

	private Resource resource1;
	private Resource resource2;

	public MyThread5(Resource resource1, Resource resource2) {
		super();
		this.resource1 = resource1;
		this.resource2 = resource2;
	}

	@Override
	public void run() {
		synchronized (resource1) {
			System.out.println(this.getName() + " has applied lock on resource1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (resource2) {
				System.out.println(this.getName() + " has applied lock on resource2");
			}
		}
	}

}
