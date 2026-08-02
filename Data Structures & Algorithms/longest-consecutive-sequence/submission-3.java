class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        for(int n : nums){
            res.add(n);
        }
        int max =0;
        for(int num : res){
            int n = num - 1;
            if(!res.contains(n)){
                int curr = n;
                int count = 0;
                while(res.contains(curr + 1)){
                    count++;
                    curr++;
                }
                if(count > max){
                    max = count;
                }
            }
        }
        return max;
    }
}
