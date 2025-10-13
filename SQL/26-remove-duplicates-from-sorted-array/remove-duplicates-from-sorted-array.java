class Solution {
    public int removeDuplicates(int[] nums) {
	    List<Integer> list = new ArrayList<>();

	    for (int item : nums) {
	        if (!list.contains(item)) {
	            list.add(item);
	        }
	    }

	    for (int index = 0; index < nums.length; index++) {
	        if (index < list.size())
	            nums[index] = list.get(index);
	        else
	            nums[index] = -101;
	    }

	    return list.size();
	}
}