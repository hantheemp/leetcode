class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

		int numberOfRows = image.length;
		int numberOfColumns = image[0].length;

		int result[][] = new int[numberOfRows][numberOfColumns];

		for (int index = 0; index < numberOfRows; index++) {
			for (int i = 0; i < numberOfColumns; i++) {
				result[index][i] = image[index][numberOfColumns - 1 - i];
				if (result[index][i] == 1)
					result[index][i] = 0;
				else
					result[index][i] = 1;
			}
		}

		return result;

	}
}