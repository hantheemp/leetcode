class Solution {
    public boolean checkPerfectNumber(int num) {

		List<Integer> list = new ArrayList<Integer>();

		int index = 1;
		while (index < num) {
			if (num % index == 0) {
				list.add(index);
			}
			index++;
		}

		int sum = 0;

		for (int idx = 0; idx < list.size(); idx++) {
			sum += list.get(idx);
		}

		return (sum == num) ? true : false;

	}
}