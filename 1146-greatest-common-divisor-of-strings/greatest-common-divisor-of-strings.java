class Solution {
    public static String gcdOfStrings(String str1, String str2) 
	{
		if (!(str1 + str2).equals(str2 + str1))
		{
			return "";
		}
		
		int gcdNumber = gcd(str1.length(), str2.length());
		
		return str1.substring(0, gcdNumber);
		
	}
	
	private static int gcd(int len1, int len2)
	{
		while (len2 != 0)
		{
			int temp = len2;
			len2 = len1 % len2;
			len1 = temp;
		}
		
		return len1;
		
	}
}