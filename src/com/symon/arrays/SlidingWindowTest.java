package com.symon.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowTest {

	SlidingWindow slidingWindow = new SlidingWindow();

	@Test
	void minSubArrayLen() {
		int[] testArr1 = {1,1,1,1,1,1,1,1};
		int[] testArr2 = {2,3,1,2,4,3};
		int target1 = 11;

		assertEquals(0, slidingWindow.minSubArrayLen(target1, testArr1));
		assertEquals(2, slidingWindow.minSubArrayLen(7, testArr2));
	}

	@Test
	void testOnLargeArray(){
		int[] largeArray = {};
	}
}