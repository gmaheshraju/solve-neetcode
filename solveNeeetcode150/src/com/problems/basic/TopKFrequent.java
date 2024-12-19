package com.problems.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequent {

	public static void main(String[] args) {

		int[] InputArr = { 1, 1,3, 4, 5, 3, 3, 4, 5,5,5,5,5 ,6, 2, 3, 3, };
		topKFrequent(InputArr, 3);
	}

	public static int[] topKFrequent(int[] nums, int k) {

		if (k == nums.length) {
			return nums;
		}

		Map<Integer, Integer> countMap = new HashMap<>();

		for (int num : nums) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		System.out.println(countMap);
		// Min Heap data structure initialization
		Queue<Integer> heap = new PriorityQueue<>((a, b) -> countMap.get(a) - countMap.get(b)); // Max-heap

		for (int num : countMap.keySet()) {

			heap.add(num);

			if (heap.size() > k) {
				heap.poll();
			}

		}

		int[] output = new int[k];

		 for (int i = 0; i <k; i++) {
	            output[i] = heap.poll(); // Fill the array from the end to maintain descending order
	     }
	
		
		System.out.println(Arrays.toString(output));

		return output;
	}

}
