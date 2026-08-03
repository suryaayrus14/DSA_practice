class Solution {
    public int trap(int[] height) {
        int left = 0,right = height.length-1,lmax = 0,rmax = 0,total_water = 0;

        while(left < right){
            lmax = Math.max(lmax,height[left]);
            rmax = Math.max(rmax,height[right]);

            if(lmax < rmax){
                total_water += lmax - height[left];
                left++;
            }
            else{
                total_water += rmax - height[right];
                right--;
            }

        }
        return total_water;
    }
}