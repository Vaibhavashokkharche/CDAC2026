package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.SelectionSortAlgorithm;

public class TestSelectionSort {

	public static void main(String[] args) {
		int[] arr= {10,7,12,9,13,15,7,2,1,8,5};
		SelectionSortAlgorithm.selectionSortAscending(arr);
		System.out.println("sorted array : ");
		System.out.println(Arrays.toString(arr));

	}

}
