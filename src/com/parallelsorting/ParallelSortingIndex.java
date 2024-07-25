package com.parallelsorting;

import java.util.Arrays;

public class ParallelSortingIndex {

	public static void main(String[] args) {
		
		int arr[]= {3,5,2,6,8,6,0,-2};
		System.out.println("Before sorting the array:");
		for(int i:arr)
		{
			System.out.println(i);
		}
		Arrays.sort(arr,0,4);
		System.out.println("After sorting array index from o to 4: ");
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}

}
