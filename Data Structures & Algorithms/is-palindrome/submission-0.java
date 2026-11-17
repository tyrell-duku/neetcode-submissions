class Solution {
    public boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        while (leftPointer < rightPointer) {
            char leftChar = s.charAt(leftPointer);
            char rightChar = s.charAt(rightPointer);
            // Left char checks
            if (!Character.isLetterOrDigit(leftChar)) {
                // Do nothing
                leftPointer++;
                continue;
            }

            if (!Character.isLetterOrDigit(rightChar)) {
                // Do nothing
                rightPointer--;
                continue;
            }

             if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }
            leftPointer++;
            rightPointer--;

        }
        return true;
    }
}
