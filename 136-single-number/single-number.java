class Solution {
    public int singleNumber(int[] nums) {
        
		Arrays.sort(nums);

		int res = -1;

		for (int index = 0; index < nums.length; index++) {
			if ((index < nums.length - 1 && nums[index] == nums[index + 1])
					|| (index > 0 && nums[index] == nums[index - 1])) {
				continue;
			}

			res = nums[index];
		}

		return res;
	
    }
}