class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int left = 1;
        int right = 0;
        for (int bloom : bloomDay) {
            right = Math.max(right, bloom);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int consecutive = 0;
            int bouquet = 0;

            for (int bloom : bloomDay) {
                if (bloom <= mid) {
                    consecutive++;
                } else {
                    consecutive = 0;
                }
                if (consecutive == k) {
                    bouquet++;
                    consecutive = 0;
                }
            }
            if (bouquet >= m) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}