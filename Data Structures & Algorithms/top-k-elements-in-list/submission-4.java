class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Make frequency map
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQ = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        for (int i : nums) {
            Integer retrieval = map.get(i);
            if (retrieval != null) {
                map.put(i, retrieval + 1);
            } else {
                map.put(i, 1);
            }
        }
        // Pass over map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            priorityQ.offer(entry);
            if (priorityQ.size() > k) {
                // Remove top of list.
                priorityQ.poll();
            }
           
        }
        // Return k elements.
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = priorityQ.poll().getKey();
        }
        return answer;

    }
}
