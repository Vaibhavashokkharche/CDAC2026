package com.demo.sorting;

import java.util.Arrays;

public class CountintingSortAlgorithm {
	
	
        public static int[] countingSort(int[] arr) {
        	//find max
        	int maxnum=findMax(arr);
        	//create a array of size max+1
        	int[] countarr=new int[maxnum+1];
        	//initialize the array to 0
        	for(int i=0;i<countarr.length;i++) {
        		countarr[i]=0;
        	}
        	//find number of occurrences for each distinct number
        	for(int i=0;i<arr.length;i++) {
        		   int pos=arr[i];
        		   countarr[pos]++;
        	}
        	System.out.println("Array :"+Arrays.toString(arr));
        	System.out.println("Count array :");
        	System.out.println(Arrays.toString(countarr));
        	//find cummulative sum
        	for(int i=1;i<countarr.length;i++) {
        		countarr[i]=countarr[i]+countarr[i-1];
        	}
        	System.out.println("cummulative sum array");
        	System.out.println(Arrays.toString(countarr));
        	int[] output=new int[arr.length];
        	for(int i=0;i<arr.length;i++) {
        		int pos=arr[i];   
        		countarr[pos]=countarr[pos]-1;   
        		int idx=countarr[pos];
        		output[idx]=arr[i];
        		
        	}
        	return output;
        	
        }

		private static int findMax(int[] arr) {
			int max=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
				
			}
			return max;
		}

}
