class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

		int result[][] = new int[image.length][image[0].length];

		for (int index = 0; index < result.length; index++) {
			for (int i = 0; i < result[0].length; i++) {
				result[index][i] = image[index][result[0].length - 1 - i];
				result[index][i] = (result[index][i] == 1) ? 0 : 1;
			}
		}

		return result;

	}
}