package engineer.vel.alogirthms.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	TwoSum obj = new TwoSum();

	@Test
	final void testTwoSum() {
		assertArrayEquals(new int[] { 0, 1 }, obj.twoSum(new int[] { 2, 7, 11, 15 }, 9));
		assertArrayEquals(new int[] { 1, 2 }, obj.twoSum(new int[] { 3, 2, 4 }, 6));
		assertArrayEquals(new int[] { 0, 1 }, obj.twoSum(new int[] { 3, 3 }, 6));
	}

}
