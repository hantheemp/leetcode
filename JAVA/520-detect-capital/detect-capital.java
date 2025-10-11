class Solution {
    public boolean detectCapitalUse(String word) {

        return word.matches("[A-Z]+") || word.matches("[a-z]+") || word.matches("[A-Z]{1}[a-z]+");  
        
    }
}