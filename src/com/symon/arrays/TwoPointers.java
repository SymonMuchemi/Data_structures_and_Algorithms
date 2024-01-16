package com.symon.arrays;
/**
 * this program shows the various implementations of the two-pointers algorithm on arrays
 * */

public class TwoPointers {
	/**
	 * using two pointers that move toward the middle to find the target sum
	 * @param nums sorted array of numbers
	 * @param target the sum of two array elements
	 * */

	public boolean twoSum(int[] nums, int target) {
		int p1 = 0, p2 = nums.length - 1;

		while (p1 < p2){
			int sum = nums[p1] + nums[p2];

			if (sum == target)
				return true;
			else if (sum < target) {
				p1++;
			}
			else
				p2--;
		}
		return false;
	}

	/**
	 * this simply returns an array of indexes
	 *
	 *  @param nums sorted array of numbers
	 * 	@param target the sum of two array elements
	 * */
	public int[] twoSumArray(int[] nums, int target) {
		int[] indexesArray = new int[2];
		int p1 = 0, p2 = nums.length - 1;

		while (p1 < p2) {
			int sum = nums[p1] + nums[p2];

			if (sum == target) {
				indexesArray[0] = p1;
				indexesArray[1] = p2;

				return indexesArray;
			} else if (sum < target) {
				p1++;
			} else {
				p2++;
			}
		}
		return indexesArray;
	}
}
