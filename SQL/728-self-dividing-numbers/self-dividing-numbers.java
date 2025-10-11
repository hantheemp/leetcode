class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {

		List<Integer> result = new ArrayList<Integer>();
		
		for (int index = left; index <= right; index++) {
			if (isSelfDivisable(index))
				result.add(index);
		}
		
		return result;
		
	}
	
	public static boolean isSelfDivisable(int number) {
		
		int temp = number;
		
		while (temp > 0) {
			int digit = temp % 10;
			if (digit == 0 || number % digit != 0) { // -> If digit is 0, it'll throw arithmetic exception.
				return false;
			}
			temp /= 10;
		}
		
		return true;
		
	}
}