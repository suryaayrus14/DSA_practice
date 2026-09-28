class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int pile: piles){
            right = Math.max(right,pile);
        }
        while(left <= right){
            int mid = left + (right - left)/2;
            long total_hrs = 0;

            for(int pile : piles){
                long hrs = (long) Math.ceil((double) pile / mid);
                total_hrs += hrs;
            }
            if(total_hrs <= h){
                right = mid-1;
            }
            else{
                left = mid+1;
            }

        }
        return left;


    }
}