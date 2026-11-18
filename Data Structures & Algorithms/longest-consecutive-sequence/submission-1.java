class Solution {
    public int longestConsecutive(int[] nums) {
       int longest = 0;
       Set<Integer> numSet = new HashSet<>();
       for (int n : nums) {
        numSet.add(n);
       }

       for (int n : numSet) {
        if (numSet.contains(n - 1)) {
            continue;
        }
        int longestSoFar = 1;
        int targetNum = n;
        while (numSet.contains(targetNum + 1)) {
            longestSoFar++;
            targetNum++;

        }
        if (longestSoFar > longest) {
            longest = longestSoFar;
        }
       }
       return longest;
    }
}