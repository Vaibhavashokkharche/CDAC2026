package com.demo.test;

import com.demo.model.MyStorage;
import com.demo.threads.Consumer;
import com.demo.threads.Producer;

public class TestProducerConsumer {

	public static void main(String[] args) {
		MyStorage ob=new MyStorage();
		Producer p=new Producer(ob);
		Consumer c=new Consumer(ob);
		p.start();
		c.start();

	}

}
