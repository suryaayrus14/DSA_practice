class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n =  nums.length;
        double max_avg = 0;
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }
        double avg = (double)sum/k;
        max_avg= avg;
        for(int i = k;i<n;i++){
            sum = sum - nums[i-k] + nums[i];
            avg = (double)sum/k;
            max_avg = Math.max(avg,max_avg);
        }
       return max_avg; 
    }
}