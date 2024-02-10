class Solution {
    public String reverseWords(String s) {

		String[] tempArr = s.split(" ");

		String res = "";

		for (int index = tempArr.length - 1; index >= 0; index--) {
			
			if (tempArr[index].isBlank())
				continue;
			
			res += tempArr[index] + " "; 

		}
		
		 res = res.trim();

		return res;

	}
}