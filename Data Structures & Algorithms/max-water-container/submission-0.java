class Solution {
    public int maxArea(int[] heights) {

        int leftPtr = 0;
        int rightPtr = heights.length - 1;
        int maxArea = 0;
        while (leftPtr < rightPtr) {
            int area = (rightPtr - leftPtr) * Math.min(heights[leftPtr], heights[rightPtr]);
            if (area > maxArea) {
                maxArea = area;
            }

            // Moving shorter bar
            if (heights[leftPtr] <= heights[rightPtr]) {
                leftPtr++;
            } else {
                rightPtr--;
            }
        
        }
        return maxArea;
        
    }
}
