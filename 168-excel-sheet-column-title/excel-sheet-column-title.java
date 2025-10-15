class Solution {
    public String convertToTitle(int columnNumber) {

		int num = columnNumber;

		StringBuilder sb = new StringBuilder();

		while (num != 0) {
			num--;
			sb.append((char) ('A' + num % 26));
			num /= 26;
		}

		return sb.reverse().toString();

	}
}