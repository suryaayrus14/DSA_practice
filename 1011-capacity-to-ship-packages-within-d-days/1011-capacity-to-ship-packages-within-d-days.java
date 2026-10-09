class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int wt : weights) {
            low = Math.max(low, wt);
            high += wt;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int w_sum = 0;
            int total_days = 1;
            for (int wt : weights) {
                if (w_sum + wt <= mid) {
                    w_sum += wt;
                } else {
                    total_days++;
                    w_sum = wt;
                }
            }
            if (total_days <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}