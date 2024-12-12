package com.problems.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		// Additional Data structure Map for better time complexity.
		Map<Integer, Integer> inputMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (inputMap.containsKey(complement)) {

				return new int[] { inputMap.get(complement), i };

			}

			inputMap.put(nums[i], i);

		}

		return new int[] {};

	}

	public static void main(String[] args) {
      
		int[] input = { 1, 7, 12, 4, 2 };
		int target = 9;
		int[] result = twoSum(input, target);

		System.out.println(Arrays.toString(result));

	}

}
