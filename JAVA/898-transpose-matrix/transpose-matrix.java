class Solution {
    public int[][] transpose(int[][] matrix) {
		
		int numberOfRows = matrix.length;
		int numberOfColumns = matrix[0].length;

		int result[][] = new int[numberOfColumns][numberOfRows];

		for (int index = 0; index < numberOfColumns; index++) {
			for (int i = 0; i < numberOfRows; i++) {
				result[index][i] = matrix[i][index];
			}
		}

		return result;

	}
}