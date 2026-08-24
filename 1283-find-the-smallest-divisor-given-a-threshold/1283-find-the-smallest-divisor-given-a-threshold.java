class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        for(int n : nums){
            right = Math.max(right,n);
        }
        while(left <= right){
            int sum = 0;
            int mid = left + (right - left)/2;
            for(int n : nums){
                int div =(int) Math.ceil((double)n/mid);
                sum+=div;
            }
            if(sum <= threshold){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}