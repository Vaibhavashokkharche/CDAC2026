package com.demo.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import com.demo.threads.TaskCallable;

public class TestCallable {
public static void main(String[] args) {
	   TaskCallable ob=new TaskCallable(10,20);
	   
	   FutureTask<Integer> f=new FutureTask<>(ob);
	   
	   Thread th=new Thread(f);
	   th.start();
	   try {
		int result=f.get();
		System.out.println("Result: "+result);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
