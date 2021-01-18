package engineer.vel.alogirthms.solutions;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target
 * 
 * @author vel
 *
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			int expectedValue = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == expectedValue) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}
}
