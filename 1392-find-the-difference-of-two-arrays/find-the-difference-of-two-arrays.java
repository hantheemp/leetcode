class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		
		List<Integer> nw1 = new ArrayList<Integer>();
		List<Integer> nw2 = new ArrayList<Integer>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		for (int index : nums1) 
		{
			nw1.add(index);
		}
		
		for (int index : nums2)
		{
			nw2.add(index);
		}
		
		List<Integer> nw11 = new ArrayList<Integer>();
		List<Integer> nw22 = new ArrayList<Integer>();
		
		for (int index = 0; index < nw1.size(); index++)
		{
			if (!nw2.contains(nw1.get(index)))
			{
				nw11.add(nw1.get(index));
			}
		}
		
		for (int index = 0; index < nw2.size(); index++)
		{
			if (!nw1.contains(nw2.get(index)))
			{
				nw22.add(nw2.get(index));
			}
		}
		
		res.add(nw11.stream().distinct().collect(Collectors.toList()));
		res.add(nw22.stream().distinct().collect(Collectors.toList()));
		
		return res;
		
	 }
}