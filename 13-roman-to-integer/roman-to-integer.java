class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> map = Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
        );

        int totalValue = 0;
        int currentValue = 0;
        int previousValue = 0;

        for (int index = s.length() -1; index >= 0; index--){
            currentValue = map.get(s.charAt(index));

            if (currentValue >= previousValue){
                totalValue += currentValue;
                previousValue = currentValue;
            }

            if (currentValue < previousValue){
                totalValue -= currentValue;
                previousValue = currentValue;
            }
            

        }

        return totalValue;

    }
}