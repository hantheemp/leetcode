class Solution {
    public static int firstUniqChar(String s) {

		/*
		 * Key - value pairs. Keys can be the index of loop, values can be the
		 * characters of string? Instead of making indexes keys, reverse it.
		 * 
		 */

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int index = 0; index < s.length(); index++) {

			char chr = s.charAt(index);

			if (!map.containsKey(chr)) {
				map.put(chr, 1);
			}

			else {
				map.put(chr, map.get(chr) + 1);
			}

		}

		if (map.containsValue(1)) {

			for (int index = 0; index < s.length(); index++) {
				if (map.get(s.charAt(index)) == 1)
					return index;
			}

		}

		return -1;

	}
}