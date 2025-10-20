import static java.util.Map.entry;
class Solution {
    public static int finalValueAfterOperations(String[] operations) {

		Map<String, Integer> map = Map.ofEntries(entry("++X", 1), entry("X++", 1), entry("--X", -1), entry("X--", -1));

		int result = 0;

		for (int i = 0; i < operations.length; i++) {
			result += map.get(operations[i]);
		}

		return result;

	}
}