class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

		String[] words = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");

		Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String item : words) {
			if (!bannedSet.contains(item)) {
				if (!map.containsKey(item)) {
					map.put(item, 1);
				} else {
					map.put(item, map.get(item) + 1);
				}
			}

		}

		String mostCommon = "";
		int maxCount = 0;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				mostCommon = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		return mostCommon;

	}
}