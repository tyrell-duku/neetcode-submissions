class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleets = 0;
        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            pairs.add(new Pair(position[i], speed[i]));
        }
        pairs.sort((p1, p2) -> p2.getKey()
                                .compareTo(p1.getKey())); 
        // track fleet time 
        double ft = 0;

        for (int i = 0; i < position.length; i++) {
            double time = (double) (target - pairs.get(i).getKey()) / pairs.get(i).getValue();
            if (time > ft) {
                fleets++;
                ft = time;
            }
        }

        return fleets;

    }
}
