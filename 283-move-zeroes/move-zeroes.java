class Solution {
    public void moveZeroes(int[] nums) {
		
		int count = 0;
		
		for (int index = 0; index < nums.length; index++)
		{
			if (nums[index] != 0)
			{
				nums[count++] = nums[index];
			}
		}
		
		while (count < nums.length)
		{
			nums[count++] = 0;
		}
		
	}
}