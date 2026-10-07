class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        long sum = 0;
        long max_sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int right = 0; right < nums.length;right++){
            sum += nums[right];
            hm.put(nums[right],hm.getOrDefault(nums[right],0)+1);
            if(right - left + 1 == k){
                if(hm.size() == k){
                    max_sum = Math.max(max_sum,sum);
                }
                sum -= nums[left];
                if (hm.get(nums[left]) == 1) {
                    hm.remove(nums[left]);
                } else {
                    hm.put(nums[left], hm.get(nums[left]) - 1);
                }
                left++;
                
            }
        }
        return max_sum;
    }

}