class Solution {
    public boolean isSubsequence(String s, String t) {
        
        Stack<Character> stack = new Stack<Character>();

		for (int index = 0; index < s.length(); index++) {
			stack.push(s.charAt(index));
		}

		for (int index = t.length() - 1; index >= 0; index--) {
			if (!stack.empty()) {
				if (t.charAt(index) == stack.peek())
					stack.pop();
			}

		}

		if (stack.isEmpty())
			return true;

		return false;

    }
}