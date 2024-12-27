package com.problems.basic;

import java.util.HashSet;

public class LongestConseutiveSequence {

	public static int longestConsecutive(int[] nums) {
		if (nums.length == 0)
			return 0;

		HashSet<Integer> numSet = new HashSet<>();
		for (int num : nums) {
			numSet.add(num);
		}

		int longestSub = 0;

		for (int num : numSet) {
			// Check if the number is the start of a sequence
			if (!numSet.contains(num - 1)) {
				int currentNum = num;
				int currentSub = 1;

				// Count the length of the sequence
				while (numSet.contains(currentNum + 1)) {
					currentNum++;
					currentSub++;
				}

				longestSub = Math.max(longestSub, currentSub);
			}
		}

		return longestSub;
	}
	
	public static void main(String[] args) {
		int[] nums =  {100, 4, 200, 1, 3, 2};
		int longestConsecutiveCount = longestConsecutive(nums);
		System.out.println(longestConsecutiveCount);
	}

}
