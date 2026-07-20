class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing_nums = new ArrayList<>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] >= 0){
                    nums[index] = -1*nums[index];
            }
        }
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing_nums.add(i + 1);
            }
        }
        return missing_nums;
    }
}