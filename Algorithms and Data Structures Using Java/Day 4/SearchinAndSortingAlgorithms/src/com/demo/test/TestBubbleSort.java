package com.demo.test;

import java.util.stream.IntStream;

import com.demo.sorting.BubbleSortAlgorithm;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] arr= {21,2,5,1,7,8,10,3};
		//BubbleSortAlgorithm.bubbleSort(arr);
		//BubbleSortAlgorithm.improvedbubbleSort(arr);
		BubbleSortAlgorithm.bubbleSortDescending(arr);
		IntStream.of(arr).forEach(n->System.out.println(n));
		

	}

}
