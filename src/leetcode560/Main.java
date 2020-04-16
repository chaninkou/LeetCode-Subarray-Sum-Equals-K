package leetcode560;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,-22};
		
		System.out.println("Nums: " + Arrays.toString(nums));
		
		int k = 5;
		
		System.out.println("K: " + k);
		
		FindSubarraySumEqualToTargetFunction solution = new FindSubarraySumEqualToTargetFunction();
		
		System.out.println("Solution: " + solution.subarraySum(nums, k));
	}
}
