class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> soln = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(soln.containsKey(compliment)){
                return new int[]{soln.get(compliment),i};
            }
            soln.put(nums[i],i);
        }
        return new int[]{};
    }  
    
}