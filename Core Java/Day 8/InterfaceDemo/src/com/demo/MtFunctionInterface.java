package com.demo;

@FunctionalInterface
public interface MtFunctionInterface {
          void method1();
          default void m2() {
        	  System.out.println("test1");
          }
          
}
