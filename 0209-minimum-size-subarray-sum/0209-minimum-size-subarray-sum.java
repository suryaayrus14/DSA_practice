class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum =0;
        int left = 0;
        int min_length = Integer.MAX_VALUE;

        for(int right = 0;right<n;right++){
            sum += nums[right];
            while(sum >= target){
                min_length = Math.min(min_length,right-left+1);
                left++;
                sum -= nums[left-1];
            }
        }
        if(min_length < Integer.MAX_VALUE){
            return min_length;
        }
        else{
            return 0;
        }

    }
}