package engineer.vel.alogirthms.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaximumSubArrayTest {

	MaximumSubArray obj = new MaximumSubArray();

	@Test
	void testMaxSubArray() {
		assertEquals(6, obj.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
		assertEquals(1, obj.maxSubArray(new int[] { 1 }));
		assertEquals(0, obj.maxSubArray(new int[] { 0 }));
		assertEquals(-1, obj.maxSubArray(new int[] { -1 }));
		assertEquals(-10000, obj.maxSubArray(new int[] { -10000 }));
		assertEquals(-1, obj.maxSubArray(new int[] { -2, -1 }));
	}

}
