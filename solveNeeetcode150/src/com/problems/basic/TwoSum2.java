package com.problems.basic;

import java.util.Arrays;

public class TwoSum2 {
	public static int[] twoSum(int[] numbers, int target) {

		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			if (numbers[left] + numbers[right] > target) {
				right = right - 1;
			} else if (numbers[left] + numbers[right] < target) {
				left = left + 1;
			} else {
				return new int[] { left, right};
			}

		}
		return null;
	}

	public static void main(String[] args) {
		int[] input = {2,7,11,15};

		int[] result = twoSum(input, 26);
		System.out.println(Arrays.toString(result));

	}

}
