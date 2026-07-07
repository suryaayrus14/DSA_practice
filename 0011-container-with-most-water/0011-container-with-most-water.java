class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max_area = Integer.MIN_VALUE;

        while(left < right){
            
            int min_val = Math.min(height[left],height[right]);

            int area = (right - left) * min_val;

            max_area = Math.max(area,max_area);

            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }

        }
       return max_area;
    }
}