package com.symon.arrays;

/**
 * This program demonstrates the use of the sliding window algorithm
 * to find the maximum subarray size of an array of a specified size.
 */
public class SlidingWindow {
	/**
	 * Finds the maximum subarray size using the fixed-size window technique.
	 *
	 * @param array The input array of integers.
	 * @param size  The size of the fixed window to consider.
	 * @return The maximum subarray size.
	 */
	public int maxSubArray(int[] array, int size){
		int maxSizeSubArray = 0;
		int subArraySize = 0;

		// Calculate the initial sum of the first 'size' elements
		for (int i = 0; i < size; i++) {
			subArraySize += array[i];
		}
		// Move the fixed-size window through the array and find the maximum subarray size
		for (int i = 1; (size + i) <= array.length; i++) {
			subArraySize = subArraySize - array[i -1];
			subArraySize = subArraySize + array[size + i -1];

			// Update the maximum subarray size if needed
			maxSizeSubArray = Math.max(maxSizeSubArray, subArraySize);
		}

		return maxSizeSubArray;
	}
	/**
	 * finds the minimum subarray size using the sliding window technique
	 * @param array the input array of integers
	 * @param size the size of the subarray
	 * @return the minimum subarray size
	 * */
	public int minSubArray(int[] array, int size){
		int minSize;
		int subArrSize = 0;

		for (int i = 0; i < size; i++) {
			subArrSize += array[i];
		}

		minSize = subArrSize;

		for (int i = 1; (size + i) < array.length; i++) {
			subArrSize = subArrSize - array[i - 1];
			subArrSize = subArrSize + array[size + i - 1];

			minSize = Math.min(minSize, subArrSize);
		}

		return minSize;
	}

	/**
	 * finds the sum of the smallest subarray whose sum is greater than or equal to size
	 *
	 * @param arr the integer array
	 * @param target the summation of the subarray
	 * @return the size of the smallest subarray
	 * */
	public int smallestSubArrayCount(int [] arr, int target){
		int minCount = Integer.MAX_VALUE;
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			int sum = 0;
			int count = 0;

			for (int j = i; j < len; j++) {
				sum += arr[j];
				count += 1;

				if (sum >= target)
				{
					minCount = Math.min(minCount, count);
					break;
				}
			}
		}

		return minCount;
	}
	public int minSubArrayLen(int target, int[] nums) {
		int minCount = Integer.MAX_VALUE;
		int n = nums.length;

		for (int i = 0; i <= (n - 1); i++){
			int sum = 0;
			int count = 0;

			for (int j = i; j < n; j++){
				sum += nums[j];
				count += 1;

				if (sum >= target){
					minCount = Math.min(minCount, count);
					break;
				}

			}
		}

		if (minCount == Integer.MAX_VALUE)
			minCount = 0;

		return minCount;
	}

	public static void main(String[] args) {

	}
}