class Solution {
    public String toLowerCase(String s) {

		String result = "";

		for (char c : s.toCharArray()) {
			if ((int) c >= 65 && (int) c <= 90)
				result += (char) (c + 32);
			else
				result += c;
		}

		return result;

	}
}