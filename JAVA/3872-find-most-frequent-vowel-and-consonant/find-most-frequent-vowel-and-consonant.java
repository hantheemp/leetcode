class Solution {
    public int maxFreqSum(String s) {

		Map<Character, Integer> vowelMap = new HashMap<>();
		vowelMap.put('a', 0);
		vowelMap.put('e', 0);
		vowelMap.put('i', 0);
		vowelMap.put('o', 0);
		vowelMap.put('u', 0);
		Map<Character, Integer> consonantMap = new HashMap<Character, Integer>();

		for (int index = 0; index < s.length(); index++) {
			if (!vowelMap.containsKey(s.charAt(index)) && !consonantMap.containsKey(s.charAt(index))) {
				consonantMap.put(s.charAt(index), 1);
			} else if (!vowelMap.containsKey(s.charAt(index)) && consonantMap.containsKey(s.charAt(index))) {
				consonantMap.put(s.charAt(index), consonantMap.get(s.charAt(index)) + 1);
			} else {
				vowelMap.put(s.charAt(index), vowelMap.get(s.charAt(index)) + 1);
			}
		}

		int vowelResult = 0;
		int consonantResult = 0;

		for (Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {

			vowelResult = (vowelResult < entry.getValue()) ? entry.getValue() : vowelResult;

		}

		for (Map.Entry<Character, Integer> entry : consonantMap.entrySet()) {

			consonantResult = (consonantResult < entry.getValue()) ? entry.getValue() : consonantResult;

		}

		return vowelResult + consonantResult;

	}
}