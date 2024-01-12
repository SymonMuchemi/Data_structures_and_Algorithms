import java.util.Arrays;

/**
 * This program demonstrates the use of the fixed-size window technique
 * to find the maximum subarray size of an array of a specified size.
 */
public class Main {
	/**
	 * Finds the maximum subarray size using the fixed-size window technique.
	 *
	 * @param array The input array of integers.
	 * @param size  The size of the fixed window to consider.
	 * @return The maximum subarray size.
	 */
	public static int maxSubArray(int[] array, int size){
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
	public static int minSubArray(int[] array, int size){
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
	 * Main method to test the maxSubArray function.
	 *
	 * @param args Command-line arguments (not used in this example).
	 */
	public static void main(String[] args) {
		int[] testArray1 = {0, 2, 3, 4, 5};

		int maxSize1 = maxSubArray(testArray1, 3);
		int minSize1 = minSubArray(testArray1, 3);

		System.out.printf("Array: %s%n", Arrays.toString(testArray1));
		System.out.println("maxSize1 = " + maxSize1);
		System.out.println("minSize1 = " + minSize1);
	}
}