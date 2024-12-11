package com.jspiders.Multithreading;

import com.jspiders.Multithreading.resource.Product;
import com.jspiders.Multithreading.thread.Consumer;
import com.jspiders.Multithreading.thread.Producer;

public class App6 {

	public static void main(String[] args) {

		Product product = new Product();

		Consumer consumer = new Consumer(product);
		Producer producer = new Producer(product);

		consumer.start();
		producer.start();

	}

}
