class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int total = 0;
		
		for (int index = 0; index < timeSeries.length - 1; index++) {
			total += Math.min(duration, timeSeries[index + 1] - timeSeries[index]);
		}
		
		total += duration;
		
		return total;

}}