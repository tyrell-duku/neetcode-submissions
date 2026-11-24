class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mp = (left + right) / 2;
            if (target == nums[mp]) {
                return mp;
            } else if (target > nums[mp]) {
                // Nothing to the left can ever increase
                left = mp + 1;
            } else {
                right = mp - 1;
            }
        }

        if (nums[(left + right) / 2] != target) {
            return -1;
        }
        throw new RuntimeException("wrong answer");
    }
}
