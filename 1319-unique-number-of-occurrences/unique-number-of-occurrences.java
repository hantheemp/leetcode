class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        
		
		HashMap<Integer, Integer> numberOfOccurences = new HashMap<>();
		
		for (int index: arr)
		{
			numberOfOccurences.put(index, numberOfOccurences.getOrDefault(index, 0) + 1);
		}
		
		HashSet<Integer> values = new HashSet<Integer>(numberOfOccurences.values());
		
		return numberOfOccurences.size() == values.size();
		
	
        
    }
}