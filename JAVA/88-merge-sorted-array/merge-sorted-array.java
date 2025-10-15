class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointerA = m - 1;
        int pointerB = n - 1;
        int pointerC = m + n - 1;

        while (pointerA >= 0 && pointerB >= 0) {
            if (nums1[pointerA] > nums2[pointerB]) {
                nums1[pointerC] = nums1[pointerA];
                pointerA--;
            } else {
                nums1[pointerC] = nums2[pointerB];
                pointerB--;
            }
            pointerC--;
        }
        
        while (pointerB >= 0) {
            nums1[pointerC] = nums2[pointerB];
            pointerB--;
            pointerC--;
        }
    }
}