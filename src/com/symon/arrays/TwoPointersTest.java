package com.symon.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoPointersTest {

	TwoPointers tp = new TwoPointers();
	int[] arr1 = {1, 1, 2, 3, 4, 6, 8, 9}, arr2 = {3,2,4};;

	@Test
	void twoSumTrue() {
		assertTrue(tp.twoSum(arr1, 11));
	}

	@Test
	void testOn3(){
		int[] indexes = tp.twoSumArray(arr2, 6);

		assertEquals(1, indexes[0]);
		assertEquals(1, indexes[1]);
	}

	@Test
	void twoSumFalse(){
		assertFalse(tp.twoSum(arr1, 20));
	}

	@Test
	void twoSumArray(){
		int[] indexes = tp.twoSumArray(arr1, 10);

		assertEquals(0, indexes[0]);
		assertEquals(7, indexes[1]);
	}

	@Test
	void twoSumArrayEmpty(){
		int[] emptyIndexArray = tp.twoSumArray(arr1, 20);

		assertEquals(0, Arrays.stream(emptyIndexArray).sum());
	}
}