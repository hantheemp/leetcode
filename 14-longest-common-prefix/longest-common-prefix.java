class Solution {
    public String longestCommonPrefix(String[] strs) {

       String firstElement = strs[0];
	     String compareElement = "";

	        for (int index = 0; index < strs.length; index++){
	            compareElement = strs[index];
	            
	            if (firstElement.length() > compareElement.length())
	            	firstElement = firstElement.substring(0, compareElement.length());
	            
	            for (int idx = firstElement.length() - 1; idx >= 0; idx--){
	                if (firstElement.charAt(idx) != compareElement.charAt(idx)){
	                    firstElement = firstElement.substring(0, idx);
	                }
	            }
	        }

        return firstElement;
        
    }
}