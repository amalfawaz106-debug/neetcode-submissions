class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        for(int i=0 ; i<nums.length;i++){
            res.add(nums[i]);
        }
        int n = nums.length;
        int m = res.size();
        if(n != m){
            return true;
        }
        return false;
    }
}