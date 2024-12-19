package com.problems.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKMaxHeap {

	public static int[] topKFrequent(int[] nums, int k) {

		if (k == nums.length) {
			return nums;
		}

		// Step 1: Build the frequency map
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num : nums) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		System.out.println("Frequency Map: " + countMap);

		// Step 2: Use a min-heap (priority queue)
		Queue<Integer> heap = new PriorityQueue<>((a, b) -> countMap.get(a) - countMap.get(b));

		// Step 3: Add elements to the heap
		for (int num : countMap.keySet()) {
			heap.add(num);

			// If heap size exceeds k, remove the smallest frequency element
			if (heap.size() > k) {
				heap.poll();
			}
		}

		// Step 4: Extract elements from the heap
		int[] output = new int[k];
		for (int i = k - 1; i >= 0; i--) {
			output[i] = heap.poll(); // Fill the array from the end for descending order
		}

		System.out.println("Top K Frequent Elements: " + Arrays.toString(output));
		return output;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 5, 5, 5, 6, 2, 3, 3 };
		int k = 3;

		int[] result = topKFrequent(nums, k);
		System.out.println("Final Result: " + Arrays.toString(result));
	}
}
