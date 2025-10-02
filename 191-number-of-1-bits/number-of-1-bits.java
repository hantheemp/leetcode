class Solution {
    public int hammingWeight(int n) {
		
		String str = Integer.toBinaryString(n);
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.substring(index, index + 1).equals("1")) {
				count++;
			}
		}
		
		return count;
        
    }
}