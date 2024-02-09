class Solution {
    public String mergeAlternately(String word1, String word2) {

        
		
		int n = word1.length(), 
			m = word2.length();
		
		String result = "";
		
		if (n == m)
		{
			for (int index = 0; index < n; index++)
			{
				result += word1.charAt(index);
				result += word2.charAt(index);
			}
		}
		
		else if (n > m)
		{
			for (int index = 0; index < m; index++)
			{
				result += word1.charAt(index);
				result += word2.charAt(index);
			}
			
			result += word1.substring(m);
			
		}
		
		else
		{
			for (int index = 0; index < n; index++)
			{
				result += word1.charAt(index);
				result += word2.charAt(index);
			}
			
			result += word2.substring(n);
			
		}
		
		return result;
		
	
        
    }
}