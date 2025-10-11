class Solution {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();

        char currentCharacter;
        char previousCharacter;
        
        for (int index = 0; index < s.length(); index++){

            currentCharacter = s.charAt(index);

            if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{'){
                stack.push(s.charAt(index));
            }
            if (currentCharacter == ')' || currentCharacter == ']' || currentCharacter == '}'){
                if (stack.empty()){
                    return false;
                }

            previousCharacter = stack.peek();

            if (currentCharacter == ')' && previousCharacter == '(')
                stack.pop();
            else if (currentCharacter == ']' && previousCharacter == '[')
                stack.pop();
            else if (currentCharacter == '}' && previousCharacter == '{')
                stack.pop();
            else
                return false;

        }

    }

    if (stack.empty())
        return true;
    else
        return false;

}}