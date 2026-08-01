class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> res = new HashMap<>();
        int i =0;
        int[] a = new int[2];
        for(int n : nums){
            int s = target - n;
            if(res.containsKey(s)){
                a[0] = res.get(s);
                a[1] = i;
            }
            res.put(n,i);
            i++;
        }
        return a;
    }
}
