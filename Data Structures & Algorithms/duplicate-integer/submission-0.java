class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (hashMap.get(num) != null) {
                return true;
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }
}