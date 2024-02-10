class Solution {
    public int pivotIndex(int[] nums) {

		for (int index = 0; index < nums.length; index++) {
			int resLeft = 0;
			int resRight = 0;

			for (int i = 0; i < index; i++) {
				resLeft += nums[i];
			}

			for (int i = index + 1; i < nums.length; i++) {
				resRight += nums[i];
			}

			if (resLeft == resRight)
				return index;

		}

		return -1;

	}
}