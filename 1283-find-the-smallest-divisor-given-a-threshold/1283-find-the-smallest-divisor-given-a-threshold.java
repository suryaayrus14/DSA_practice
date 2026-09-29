class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for(int n:nums){
            high = Math.max(n,high);
        }

        while(low <= high){
            int mid = low + (high - low)/2;
            int w_sum = 0;

            for(int n : nums){
                int sum = (n + mid -1)/mid;
                w_sum += sum;
            }
            if(w_sum <= threshold){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }

        }
        return low;
    }
}