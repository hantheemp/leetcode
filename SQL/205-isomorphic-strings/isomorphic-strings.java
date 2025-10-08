class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        for (int index = 0; index < s.length(); index++){

            char char1 = s.charAt(index);
            char char2 = t.charAt(index);

            if (arr1[char1] != arr2[char2])
                return false;

            arr1[char1] = s.charAt(index);
            arr2[char2] = s.charAt(index);
        }

        return true;

    }
}