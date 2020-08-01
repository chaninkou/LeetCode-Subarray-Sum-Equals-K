package leetcode560;

import java.util.HashMap;

public class FindSubarraySumEqualToTargetFunction {
	// O(n) time with O(n) space 
	public int subarraySum(int[] nums, int k) {
		int result = 0;
		int sum = 0;

		// The key will keep track of all sum
		// Value will be how many times it could add up that the same sum
		HashMap<Integer, Integer> map = new HashMap<>();

		// Required: what if itself is the target
		map.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			// Keep adding to the sum
			sum += nums[i];

			// sum - k will make sure if we seen a sum that we don't need for current index
			if (map.containsKey(sum - k)) {
				result += map.get(sum - k);
			}

			// update as needed
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		return result;
	}
	
	// O(n^2) solution with O(1) space, brute force
	public int subarraySum1(int[] nums, int k) {
		int total = 0;

		
		for (int start = 0; start < nums.length; start++) {
			int sum = nums[start];

			// Itself could be the target
			if (sum == k) {
				total++;
			}

			// Keep adding all the elements
			for (int end = start + 1; end < nums.length; end++) {
				sum += nums[end];

				// If sum is the target, update total
				if (sum == k) {
					total++;
				}
			}
		}

		return total;
	}
}
