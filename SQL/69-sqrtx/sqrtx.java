class Solution {
    public int mySqrt(int x) {

		int high = x;
		int low = 0;
		int result = 0;

		while (low <= high) {
			int middle = low + (high - low) / 2;

			if ((long)middle * middle <= x) {
				result = middle;
				low = middle + 1;
			} else {
				high = middle - 1;
			}

		}

		return result;

	}
}