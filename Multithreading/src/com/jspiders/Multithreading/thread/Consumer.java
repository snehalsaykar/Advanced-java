package com.jspiders.Multithreading.thread;

import com.jspiders.Multithreading.resource.Product;

public class Consumer extends Thread {

	private Product product;

	public Consumer(Product product) {
		super();
		this.product = product;
	}

	@Override
	public void run() {
		try {
			product.order();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}