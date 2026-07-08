class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        long sum = 0;
        long result = n*(n+1)/2;

        for(long num:nums){
            sum+=num;
        }
        return (int)(result - sum);
    }
}