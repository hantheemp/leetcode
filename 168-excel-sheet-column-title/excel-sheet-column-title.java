class Solution {
    public String convertToTitle(int columnNumber) {

		String result = "";

		Map<Integer, Character> map = new HashMap<Integer, Character>();

		for (int index = 65; index < 91; index++) {
			char character = (char) index;
			map.put(index - 65, character);
		}

		while (columnNumber != 0) {
			columnNumber -= 1;
			int remainder = columnNumber % 26;
			result = map.get(remainder) + result;
			columnNumber /= 26;
		}

		return result;

	}
}