package com.demo;

public interface MyInterface2 {
	void m1();    //public abstract
	default void m3() {
		System.out.println("in m3");
	}
	void m11();
	default void m12() {
		System.out.println("in m12 default method");
	}
}
