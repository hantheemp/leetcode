class Solution {
    public int missingNumber(int[] nums) {
		
		int res = 0;
		int n = nums.length;
		
		for (int index = 0; index <=n; index++) {
			res = res ^ index;
		}
		
		for (int index = 0; index < n; index++) {
			res = res ^ nums[index];
		}
		
		return res;

	}
}