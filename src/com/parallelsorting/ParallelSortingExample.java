package com.parallelsorting;

import java.util.Arrays;

public class ParallelSortingExample {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,7,4,3};
		System.out.println("Before Sorting of the values: ");
		for(int val:arr)
		{
			System.out.println(val);
		}
		Arrays.sort(arr);
		System.out.println("After Sorting of the values: ");
		for(int result:arr)
		{
			System.out.println(result);
		}
	}

}
