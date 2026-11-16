class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twoSumMap = new HashMap<>();
        int first = 0;
        int second = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            Integer compInMap = twoSumMap.get(complement);
            if (compInMap != null) {
                first = i;
                second = compInMap;
            }
            twoSumMap.put(num, i);
        }
       // [<3,0>, <4,1> <5,2>, <6,3>]
        // do we have target - keyset here
        return new int[]{second,first};
    }
}
