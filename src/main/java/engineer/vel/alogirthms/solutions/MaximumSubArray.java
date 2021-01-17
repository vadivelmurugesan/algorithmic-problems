package engineer.vel.alogirthms.solutions;

/**
 * In given array, find the contiguous subarray which has the largest sum
 * 
 * @author vel
 *
 */
public class MaximumSubArray {

	public int maxSubArray(int[] nums) {
		int largestSum = Integer.MIN_VALUE;

		int currentSum = 0;
		for (int index = 0; index < nums.length; index++) {
			int currentNum = nums[index];

			currentSum += currentNum;

			// Reset the current sum pointer if the current value is greater than previous
			// sum
			if (currentSum < currentNum) {
				currentSum = currentNum;
			}

			// If the current sum is larger than the largest num we try to find, then set
			// the value
			if (currentSum > largestSum) {
				largestSum = currentSum;
			}
		}
		return largestSum;

	}

}
