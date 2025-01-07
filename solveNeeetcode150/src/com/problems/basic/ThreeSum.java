package com.problems.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		// Step 1: Sort the array
		Arrays.sort(nums);

		// Step 2: Iterate through the array, fixing one number at a time
		for (int i = 0; i < nums.length - 2; i++) {
			// Skip duplicates for the fixed number
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			// Call twoSum to find pairs that sum to -nums[i]
			int target = -nums[i];
			List<List<Integer>> pairs = twoSum(nums, i + 1, target);
            System.out.println(pairs);
			// Add the fixed number to each pair and store in the result
			for (List<Integer> pair : pairs) {
				pair.add(0, nums[i]);
				result.add(pair);
			}
		}

		return result;
	}

	// Helper method to solve the 2Sum problem
	private List<List<Integer>> twoSum(int[] nums, int start, int target) {
		List<List<Integer>> pairs = new ArrayList<>();
		int left = start, right = nums.length - 1;

		while (left < right) {
			int sum = nums[left] + nums[right];

			if (sum == target) {
				pairs.add(new ArrayList<>(Arrays.asList(nums[left], nums[right])));

				// Skip duplicates for the second number
				while (left < right && nums[left] == nums[left + 1])
					left++;
				// Skip duplicates for the third number
				while (left < right && nums[right] == nums[right - 1])
					right--;

				left++;
				right--;
			} else if (sum < target) {
				left++; // Move left pointer to increase the sum
			} else {
				right--; // Move right pointer to decrease the sum
			}
		}

		return pairs;
	}

	public static void main(String[] args) {
		ThreeSum solver = new ThreeSum();

		int[] nums = { -1, 0, 1, 2, -1, -4,14,-8,-6 };
		List<List<Integer>> result = solver.threeSum(nums);

		System.out.println(result);
		// Output: [[-1, -1, 2], [-1, 0, 1]]
	}

}
