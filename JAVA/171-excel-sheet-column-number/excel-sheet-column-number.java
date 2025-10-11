class Solution {
    public int titleToNumber(String columnTitle) {

		int result = 0;
		
		Map<Character, Integer> alphabet = new HashMap<>();

		for (int i = 0; i < 26; i++) {
		    char letter = (char) ('A' + i);
		    alphabet.put(Character.valueOf(letter), i + 1);
		}
		
		for (int index = 0; index < columnTitle.length(); index++) {
			result = result * 26 + alphabet.get(columnTitle.charAt(index));
		}

        return result;
        
    }
}