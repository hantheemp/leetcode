class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < nums.length; index++){
            map.put(nums[index], index);
        }

        for (int index = 0; index < nums.length; index++){
            int complementaryNumber = target - nums[index];
            if (map.containsKey(complementaryNumber) && map.get(complementaryNumber) != index){
                return new int[]{index, map.get(complementaryNumber)};
            }
        }

        return new int[0];

    }
}