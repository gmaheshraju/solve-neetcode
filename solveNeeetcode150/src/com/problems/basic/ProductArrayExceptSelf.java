package com.problems.basic;

import java.util.Arrays;

public class ProductArrayExceptSelf {
	
	 public static int[] productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];

	        // Outer loop for each element
	        for (int i = 0; i < n; i++) {
	            int product = 1;

	            // Inner loop for multiplying all elements except nums[i]
	            for (int j = 0; j < n; j++) {
	                if (i != j) {
	                    product *= nums[j];
	                }
	            }

	            result[i] = product;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4,5};
	        int[] result = productExceptSelf(nums);

	        // Print the result array
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	

}
