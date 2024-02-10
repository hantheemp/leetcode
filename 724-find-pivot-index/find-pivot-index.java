class Solution {
    public int pivotIndex(int[] nums) {

		int total = 0;

		for (int number : nums) {
			total += number;
		}

		int leftSum = 0;

		for (int index = 0; index < nums.length; index++) {
			int rightSum = total - leftSum - nums[index];

			if (rightSum == leftSum) {
				return index;
			}

			leftSum += nums[index];

		}

		return -1;

	}
}