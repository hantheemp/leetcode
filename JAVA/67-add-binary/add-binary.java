class Solution {
    public String addBinary(String a, String b) {

		String result = "";

		int ia = a.length() - 1;
		int ib = b.length() - 1;
		int carry = 0;

		while (ia >= 0 || ib >= 0 || carry > 0) {

			char bitA = (ia >= 0) ? a.charAt(ia) : '0';
			char bitB = (ib >= 0) ? b.charAt(ib) : '0';

			if (bitA == '1' && bitB == '1') {
				if (carry == 0) {
					result += "0";
					carry = 1;
				} else {
					result += "1";
					carry = 1;
				}
			} else if ((bitA == '1' && bitB == '0') || (bitA == '0' && bitB == '1')) {
				if (carry == 0) {
					result += "1";
					carry = 0;
				} else {
					result += "0";
					carry = 1;
				}
			} else if (bitA == '0' && bitB == '0') {
				if (carry == 0) {
					result += "0";
					carry = 0;
				} else {
					result += "1";
					carry = 0;
				}
			}

			ia--;
			ib--;

		}

		StringBuilder sb = new StringBuilder();

		return sb.append(result).reverse().toString();

	}
}