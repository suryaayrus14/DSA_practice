class Solution {
    public boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        char[] arr = s.toCharArray();
        return recursivePalin(arr,0,arr.length-1);

        
    }
    public boolean recursivePalin(char[] arr,int left,int right)
    {
        if(left>=right){
            return true;
        }
        if(arr[left] != arr[right]){
            return false;
        }
        boolean ans = recursivePalin(arr,left+1,right-1);
        return ans;
    }
}