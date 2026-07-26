class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        

        for(int i =0;i<n;i++){
            int left = i+1;
            int right = n-1;
            int target = 0 - nums[i];
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            while(left < right){
                int sum = nums[left]+nums[right];
                if(sum == target){
                    List<Integer> al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[left]);
                    al.add(nums[right]);

                    result.add(al);
                     while(left < right && nums[left] == nums[left+1]){
                    left++;
                }
                while(left < right && nums[right] == nums[right-1]){
                    right--;
                }
                left++;
                right--;
                }

                if(sum > target){
                    right--;
                }
                else if(sum < target){
                    left++;
                }
                

            }

        }
        return result;
    }
}