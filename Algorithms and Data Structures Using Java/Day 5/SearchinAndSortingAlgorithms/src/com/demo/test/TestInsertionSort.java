package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.insertionSortAlgorithm;

public class TestInsertionSort {

	public static void main(String[] args) {
		int[] arr= {25,7,2,1,10,8,3,9};
		insertionSortAlgorithm.insertionSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
