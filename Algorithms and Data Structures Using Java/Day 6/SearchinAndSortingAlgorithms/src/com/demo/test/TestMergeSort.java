package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.MergeSortAlgorithm;

public class TestMergeSort {

	public static void main(String[] args) {
	    int[] arr= {12,3,4,8,6,7,5,4,2};
	    MergeSortAlgorithm.mergeSort(arr, 0, arr.length-1);
	    System.out.println(Arrays.toString(arr));

	}

}
