class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<Boolean>();

		int maxCandies = candies[0];

		for (int index = 1; index < candies.length; index++) {
			maxCandies = Math.max(maxCandies, candies[index]);
		}

		for (int candy : candies) {
			result.add((candy + extraCandies) >= maxCandies);
		}

		return result;

	}
}