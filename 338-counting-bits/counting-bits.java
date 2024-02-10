class Solution {
    public int[] countBits(int n) {
      
		
		String[] arr = new String[n + 1];
		
		int [] res = new int[n + 1];

		for (int index = 0; index <= n; index++)
		{
			res[index] = Integer.bitCount(index);
		}
		
		return res;
		
	  
    }


}