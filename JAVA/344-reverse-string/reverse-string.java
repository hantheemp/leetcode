class Solution {
    public void reverseString(char[] s) {

		for (int index = 0; index < s.length / 2; index++) {
			char firstElement = s[index];
			char lastElement = s[s.length - 1 - index];
			
			s[index] = lastElement;
			s[s.length - 1 - index] = firstElement;
			
		}
        
    }
}