class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int leftPtr = i + 1;
            int rightPtr = nums.length - 1;

            while (leftPtr < rightPtr) {
                int sum = nums[leftPtr] + nums[rightPtr];
                if (sum > target) {
                    rightPtr--;
                } else if (sum < target) {
                    leftPtr++;
                } else {
                    answer.add(List.of(nums[i], nums[leftPtr], nums[rightPtr]));
                leftPtr++;
                rightPtr--;
                while (rightPtr < rightPtr && nums[rightPtr] == nums[rightPtr + 1]) {
                    rightPtr--;
                }
                while (leftPtr < rightPtr && nums[leftPtr] == nums[leftPtr - 1]) {
                    leftPtr++;
                }
                }
                

            }
        }
        return answer;
    }
}
