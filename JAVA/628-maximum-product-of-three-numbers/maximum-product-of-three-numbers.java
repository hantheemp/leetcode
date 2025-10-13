class Solution {
    public int maximumProduct(int[] nums) {

		/*
		 * 2 Scenarios are possible:
		 * 
		 * (L) * (L - 1) * (L - 2) (N) * (N - 1) * (L - 2)
		 * 
		 */

		Arrays.sort(nums);
		int len = nums.length;

		int positiveScenario = nums[len - 1] * nums[len - 2] * nums[len - 3];
		int negativeScenario = nums[0] * nums[1] * nums[len - 1];

		return Math.max(positiveScenario, negativeScenario);

	}
}