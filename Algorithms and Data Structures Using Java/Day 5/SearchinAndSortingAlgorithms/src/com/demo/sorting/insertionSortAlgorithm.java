package com.demo.sorting;

import java.util.Arrays;

public class insertionSortAlgorithm {
	public static void insertionSortAscending(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			//i is starting of unsorted part and j is ending of sorted part
			int j=i-1;
			//copy ith element in a variable
			int key=arr[i];
			while((j>=0) &&(arr[j])>key ) {
					arr[j+1]=arr[j];
					j--;
			}
			//place the key at j+1  position
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
			
		}
	}
	
	public static void insertionSortDescending(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			//i is starting of unsorted part and j is ending of sorted part
			int j=i-1;
			//copy ith element in a variable
			int key=arr[i];
			while((j>=0) &&(arr[j])<key ) {
					arr[j+1]=arr[j];
					j--;
			}
			//place the key at j+1  position
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
			
		}
	}

}
