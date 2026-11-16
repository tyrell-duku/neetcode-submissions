class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        Queue<Integer> p = new PriorityQueue<>((a, b) -> count.get(b) - count.get(a));
        int[] answer = new int[k];   
        for (int num : count.keySet()) {
            p.add(num);
        }
        for (int i = 0; i < k; i++) {
            answer[i] = p.poll();
        }
        return answer;
    }
}
