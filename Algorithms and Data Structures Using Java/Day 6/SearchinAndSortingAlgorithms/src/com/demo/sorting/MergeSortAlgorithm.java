package com.demo.sorting;

import java.util.Arrays;

public class MergeSortAlgorithm {
	
	public static void mergeSort(int[] arr,int start,int end) {
		if(start<end) {
			//calculate mid position
			int mid=(start+end)/2;
			//left tree sorting
			mergeSort(arr,start,mid);
			//right tree sorting
			mergeSort(arr,mid+1,end);
			//merge 2 sorted array
			merge(arr,start,mid,end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		//find length of 1st array in n1 and 2nd array in n2
		int n1=mid-start+1;
		int n2=end-mid;
		int[] leftarr=new int[n1];
		int[] rightarr=new int[n2];
		//copy left array
		for(int i=0;i<n1;i++) {
			leftarr[i]=arr[start+i];
		}
		//copy rigth array
		for(int i=0;i<n2;i++) {
			 rightarr[i]=arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=start;
		//merge both arrays till one of then is over
		while((i<n1) && (j<n2)) {
			if(leftarr[i]<rightarr[j]) {
				arr[k]=leftarr[i];
				k++;
				i++;
			}else {
				arr[k]=rightarr[j];
				k++;
				j++;
			}
		}
		//copy remaining part of leftarr to arr
		while(i<n1) {
			arr[k]=leftarr[i];
			k++;
			i++;
		}
		//copy remaining part of rightarr to arr
		while(j<n2) {
			arr[k]=rightarr[j];
			k++;
			j++;
		}
		System.out.println(start+"----"+mid+"------"+end);
		System.out.println(Arrays.toString(leftarr));
		System.out.println(Arrays.toString(rightarr));
		System.out.println("-----------------------------");
		
	}

}
