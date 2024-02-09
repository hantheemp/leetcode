class Solution {
    public String removeStars(String s) {

      

		Stack<Character> stack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();

		for (char i : s.toCharArray()) {
			if (i == '*' && !stack.isEmpty()) {
				stack.pop();
			}

			else {
				stack.push(i);
			}

		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		return sb.reverse().toString();

	

    }
}