class Solution {
    public int singleNumber(int[] nums) {
        int ress=0;
        for(int n : nums){
            ress^=n;
        }
        return ress;
    }
}