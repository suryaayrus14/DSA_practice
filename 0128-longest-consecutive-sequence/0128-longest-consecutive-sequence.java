class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int n : nums) {
            hs.add(n);
        }
        int max = 0;
        for (int n : hs) {
            if (!hs.contains(n - 1)) {
                int current = n;
                int consecutive = 1;
                while (hs.contains(current + 1)) {
                    current++;
                    consecutive++;
                }
                max = Math.max(max, consecutive);
            }
        }

        return max;
    }
}