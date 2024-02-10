class Solution {
    public int largestAltitude(int[] gain) {
        
		
		int[] res = new int[gain.length + 1];
		int start = 0;
		res[0] = start;
		
		for (int index = 0; index < gain.length; index++)
		{
			res[index+1] = (start + gain[index]);
			start = res[index+1];
		}
		
		Arrays.sort(res);
		
		return res[res.length - 1];
		
	
    }
}