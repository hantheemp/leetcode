class Solution {
    public int removeElement(int[] nums, int val) {
		List<Integer> list = new ArrayList<Integer>();

		for (int item : nums) {
			if (item != val)
				list.add(item);
		}

		for (int index = 0; index < nums.length; index++) {
			if (index < list.size())
				nums[index] = list.get(index);
			else
				nums[index] = -1;
		}

		return list.size();

	}
}