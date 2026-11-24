class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = (m * n) - 1;
        while (left <= right) {
            int mp = (left + right) / 2;
            int mpr = mp / n;
            int mpc = mp % n;
            if (matrix[mpr][mpc] == target) {
                return true;
            } else if (matrix[mpr][mpc] < target) {
                left = mp + 1;
            } else {
                right = mp - 1;
            }
        }
        return false;
    }
}
