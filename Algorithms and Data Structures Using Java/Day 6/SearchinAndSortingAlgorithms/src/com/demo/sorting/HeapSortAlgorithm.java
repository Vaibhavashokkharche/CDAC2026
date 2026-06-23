package com.demo.sorting;

import java.util.Arrays;

public class HeapSortAlgorithm {
	  public static void heapSortAscending(int[] arr) {
		  //convert the tree into max heap
		  for(int i=(arr.length/2)-1;i>=0;i--) {
			  heapify(arr,arr.length,i);
		  }
		  
		  int n=arr.length;
		  for (int i=n-1;i>=0;i--) {
			  //swap the topmost value with the last value i n the array
			  int temp=arr[i];
			  arr[i]=arr[0];
			  arr[0]=temp;
			  //reconvert the tree in to heap, by using heapify algoritm
			  heapify(arr,i,0);

		  }
		  
	  }

	  private static void heapify(int[] arr, int n, int i) {
		  //calculate left and right index position
		int left=2*i+1;
		int right=2*i+2;
		int largest=i;
		//check whether left is within limit and is it the largest one 
		if( left<n&& arr[left]>arr[largest]) {
			largest=left;
		}
		//check whether right is within limit and is it the largest one 
		if(right<n && arr[right]>arr[largest]) {
			largest=right;
		}
		//if largest is either left or right child then swap with parent
		if(largest!=i) {
			//swap the largest and i if largest and i are not sme
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			// reheapify the following tree
			heapify(arr,n,largest);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------------------------");
	  }

}
