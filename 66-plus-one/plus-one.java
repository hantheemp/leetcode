class Solution {
    public int[] plusOne(int[] digits) {
        
        int length = digits.length;

        for (int index = length - 1; index >= 0; index--){
            digits[index]++;

            digits[index] = digits[index] % 10;

            if (digits[index] != 0){
                return digits;
            }

        }

        int[] result = new int[length + 1];

        result[0] = 1;

        return result;

    }
}