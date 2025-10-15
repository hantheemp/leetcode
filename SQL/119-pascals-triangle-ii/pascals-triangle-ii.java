class Solution {
    public List<Integer> getRow(int rowIndex) {

		List<List<Integer>> generatedPascalTree = generate(rowIndex + 1);

		return generatedPascalTree.get(generatedPascalTree.size() - 1);

	}

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int index = 0; index < numRows; index++) {

			List<Integer> row = new ArrayList<>();

			for (int idx = 0; idx <= index; idx++) {

				if (idx == 0 || idx == index) {
					row.add(1);
					continue;
				} else {
					// Get previous rows previous and next elements, add them up as row.
					row.add(result.get(index - 1).get(idx - 1) + result.get(index - 1).get(idx));
				}

			}

			result.add(row);

		}

		return result;

	}
}