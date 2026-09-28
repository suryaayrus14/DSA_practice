class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int wt : weights){
            left = Math.max(left,wt);
            right += wt;
        }
        while(left <= right){
            int mid = left + (right - left)/2;
            int total_days = 1;
            int w_sum = 0;
            for(int wt:weights){
                if(w_sum + wt <= mid){
                    w_sum += wt;
                }
                else{
                total_days++;
                w_sum = wt;
                }
                
            }
            if(total_days <= days){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}