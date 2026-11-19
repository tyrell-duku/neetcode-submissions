class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> daysStillWaitingIndicies = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!daysStillWaitingIndicies.isEmpty() && temperatures[i] > temperatures[daysStillWaitingIndicies.peek()]) {
                Integer stackTop = daysStillWaitingIndicies.peek();
                if (temperatures[i] > temperatures[stackTop]) {
                    daysStillWaitingIndicies.pop();
                    answer[stackTop] = i - stackTop;
                }
            }
            daysStillWaitingIndicies.push(i);

        }
        return answer;
    }
}
