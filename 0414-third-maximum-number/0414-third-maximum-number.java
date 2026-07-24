class Solution {
    public int thirdMax(int[] nums) {
        //int n = nums.length;
        TreeSet<Integer> hm = new TreeSet<>();
       
        for(int n : nums){
            hm.add(n);
            if(hm.size() > 3){
                hm.remove(hm.first());
            }
        }
        if(hm.size() < 3){
            return hm.last();
        }
        
            return hm.first();
    
}
}