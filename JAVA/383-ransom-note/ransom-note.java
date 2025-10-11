class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int index = 0; index < magazine.length(); index++) {
			if (!map.containsKey(magazine.charAt(index))) {
				map.put(magazine.charAt(index), 1);
			} else {
				map.put(magazine.charAt(index), map.get(magazine.charAt(index)) + 1);
			}
		}

		for (int index = 0; index < ransomNote.length(); index++) {
			if (!map.containsKey(ransomNote.charAt(index)) || map.get(ransomNote.charAt(index)) < 1) {
				return false;
			}
			map.put(ransomNote.charAt(index), map.get(ransomNote.charAt(index)) - 1);
		}

		return true;

	}
}