package com.jspiders.Multithreading.thread;

import com.jspiders.Multithreading.resource.Product;

public class Producer extends Thread {

	private Product product;

	public Producer(Product product) {
		super();
		this.product = product;
	}

	@Override
	public void run() {
		product.manufacture();
	}

}

