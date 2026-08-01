class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        
        for(int i =0; i<nums.length ; i++){
            int prod = 1;
            int j = (i + 1) % nums.length;
            while(j != i){
                prod = prod * nums[j];
                j = (j + 1) % nums.length;
            }
            res[i] = prod;
        }
        return res;
    }
}  
