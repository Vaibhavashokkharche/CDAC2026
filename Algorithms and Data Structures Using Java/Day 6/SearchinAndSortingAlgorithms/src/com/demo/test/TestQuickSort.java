package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.QuickSortAlgorithm;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] arr= {10,7,12,9,13,15,7,2,1,8,5};
		QuickSortAlgorithm.quickSort(arr, 0, arr.length-1);
		System.out.println("sorted array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------------");
		int[] arr1= {33, 23,1,5,7,10,2};
		QuickSortAlgorithm.quickSort(arr1, 0, arr1.length-1);
		System.out.println("sorted array : ");
		System.out.println(Arrays.toString(arr1));

	}

}
