class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int right=0;
        int left=0;
        for(int n:weights){
            left = Math.max(n,left);
            right+=n;
        }
        while(left <= right){
            int mid = left + (right - left)/2;
            int total_days = 1;int current_load=0;
            for(int wt : weights){
                if (current_load + wt > mid) {
                    total_days++;
                    current_load = 0;
                }

                current_load += wt;
            } 
             if(total_days <= days){
                right = mid-1;
            }
            else{
                left = mid+1;
            }   
            }
           
            return left;
        }
        
    }