class Solution {
    public void moveZeroes(int[] nums) {

		List<Integer> list = new ArrayList<Integer>();

		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != 0) {
				list.add(nums[index]);
			}
		}

		for (int index = 0; index < nums.length; index++) {

			if (index < list.size())
				nums[index] = list.get(index);
			else
				nums[index] = 0;

		}

	}
}