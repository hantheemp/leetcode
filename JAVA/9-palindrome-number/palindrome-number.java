class Solution {
    public boolean isPalindrome(int x) {

        int temp = x;
        int val = 0;

        if (x < 0)
            return false;

        while (x != 0){
            val = val * 10 + x % 10;
            x = x / 10;
        }

        return (temp == val);

    }
}