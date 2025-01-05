package com.problems.basic;

import java.util.Arrays;

public class RemoveElement {

	// sorted Array
	public static int[] removeDuplicateElement(int A[], int elem) {

		int[] result = new int[A.length];
		int index = 0;
		for (int i = 0; i < A.length; i++) {
			if (i == 0 || A[i] != A[i - 1]) {
				result[index++] = A[i];
			}

		}
		result = Arrays.copyOf(result, index);
		System.out.println(Arrays.toString(result));

		return result;

	}

	public static void main(String[] args) {

		int[] input = { 1, 2, 2, 3, 4, 5 };
		int[] result = removeDuplicateElement(input, 2);
		System.out.println(result);

	}

}
