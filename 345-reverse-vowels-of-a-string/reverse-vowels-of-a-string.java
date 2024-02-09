class Solution {
    public String reverseVowels(String s) {
		
		Stack<Character> result = new Stack<Character>();
		
		for (int index = 0; index < s.length(); index++)
		{
			if (isVowel(s.charAt(index)))
			{
				result.add(s.charAt(index));
			}
		}
		
		String resStr = "";
		
		for (int index = 0; index < s.length(); index++)
		{
			if (!isVowel(s.charAt(index)))
			{
				resStr += s.charAt(index);
			}
			
			else
			{
				resStr += result.pop();
			}
		}
		
		return resStr;

	}
	
	public boolean isVowel(char c)
	{
		if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
			c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			return true;
		}
		
		return false;
		
	}
}