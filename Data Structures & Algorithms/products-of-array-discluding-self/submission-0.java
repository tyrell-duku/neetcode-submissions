class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] ps = buildPrefix(nums);
        int[] ss = buildSuffix(nums);
        for (int i = 0; i < nums.length; i++) {
            answer[i] = ps[i] * ss[i];
        }
        return answer;
    }

    private int[] buildPrefix(int[] nums) {
        int[] prefixes = new int[nums.length];
        prefixes[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixes[i] = prefixes[i - 1] * nums[i - 1];
        }
        return prefixes;
    }

    private int[] buildSuffix(int[] nums) {
        int[] prefixes = new int[nums.length];
        prefixes[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i-- ) {
            prefixes[i] = prefixes[i + 1] * nums[i + 1];
        }
        return prefixes;
    }
}  
