class Solution {
    public int longestPalindrome(String s) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int index = 0; index < s.length(); index++) {
			if (!map.containsKey(s.charAt(index)))
				map.put(s.charAt(index), 1);
			else
				map.put(s.charAt(index), map.get(s.charAt(index)) + 1);
		}

		int result = 0;
		boolean hasOdd = false;

		for (int item : map.values()) {
			result += (item / 2) * 2;
			if (item % 2 == 1)
				hasOdd = true;

		}

		return hasOdd ? result + 1 : result;

	}
}