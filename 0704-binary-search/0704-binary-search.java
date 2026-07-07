class Solution {
    public int search(int[] nums, int target) {

        int low =0;
        int high = nums.length-1;

        return binarySearch(nums,low,high,target);
        
    }
    public int binarySearch(int[] arr,int low,int high,int target){
        int mid = low + (high - low)/2;

        if(low <= high){
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                return binarySearch(arr,mid+1,high,target);
            }
            else{
                return binarySearch(arr,low,mid-1,target);
            }
            
        }
        return -1;
    }
}