class Solution {
    public String addStrings(String num1, String num2) {

		StringBuilder sb = new StringBuilder();
		int i1 = num1.length() - 1;
		int i2 = num2.length() - 1;
		int carry = 0;

		while (i1 >= 0 || i2 >= 0 || carry > 0) {
			int int1 = (i1 >= 0) ? Character.getNumericValue(num1.charAt(i1)) : 0;
			int int2 = (i2 >= 0) ? Character.getNumericValue(num2.charAt(i2)) : 0;
			int res = int1 + int2 + carry;

			sb.append(res % 10);
			carry = res / 10;

			i1--;
			i2--;

		}

		return sb.reverse().toString();

	}
}