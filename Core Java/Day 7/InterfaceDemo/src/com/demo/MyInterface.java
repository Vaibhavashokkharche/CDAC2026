package com.demo;

public interface MyInterface {
	void m1();    //public abstract
	int m2(int x);   //public abstract
	int i=34;     //public static final
	default void m3() {
		m6();
		System.out.println("in m3");
	}
	default void m5() {
		m6();
		System.out.println("in m5");
	}
	private void m6() {
		System.out.println("in m6");
	}
	static void m7() {
		System.out.println("in m7");
	}
}
