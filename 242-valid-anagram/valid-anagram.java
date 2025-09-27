class Solution {
    public boolean isAnagram(String s, String t) {
        char tempArray[] = s.toCharArray();

        Arrays.sort(tempArray);

        s = new String(tempArray);

        char tempArray2[] = t.toCharArray();

        Arrays.sort(tempArray2);

        t = new String(tempArray2);

        return (s.equals(t));

    }
}