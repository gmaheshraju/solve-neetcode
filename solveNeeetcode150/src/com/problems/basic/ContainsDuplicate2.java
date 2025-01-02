package com.problems.basic;

import java.util.HashSet;

public class ContainsDuplicate2 {
   // TODO revisit again
	public boolean containsDuplicate(int[] nums) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			} else {
				set.add(nums[i]);
			}
		}
		return false;
	}

}
