package com.demo.sorting;

import java.util.Arrays;

public class SelectionSortAlgorithm {

	
	public static void selectionSortAscending(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minpos=findNMin(arr,i);
			System.out.println(i + "th minimum value : "+arr[minpos]);
			//swap minposition with i th value
			int temp=arr[i];
			arr[i]=arr[minpos];
			arr[minpos]=temp;
			System.out.println(Arrays.toString(arr));
			
		}
	}

	private static int findNMin(int[] arr, int start) {
		   int minpos=start;
		   for(int i=start;i<arr.length;i++) {
			      if(arr[i]<arr[minpos]) {
			    	  minpos=i;
			      }
		   }
		   return minpos;
	}
	
	public static void selectionSortDescending(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int maxpos=findNMax(arr,i);
			//swap minposition with i th value
			int temp=arr[i];
			arr[i]=arr[maxpos];
			arr[maxpos]=temp;
			System.out.println(Arrays.toString(arr));
			System.out.println(i + "th maximum value : "+arr[maxpos]);
		}
	}

	private static int findNMax(int[] arr, int start) {
		   int maxpos=start;
		   for(int i=start;i<arr.length;i++) {
			      if(arr[i]>arr[maxpos]) {
			    	  maxpos=i;
			      }
		   }
		   return maxpos;
	}
}
