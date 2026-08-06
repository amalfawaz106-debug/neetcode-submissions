class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0 ; i<nums.length ; i++){
            int first = nums[i];
            HashSet<Integer> found = new HashSet<>();
            for(int j= i + 1; j<nums.length ; j++){
                int second = nums[j];
                int third = -(first + second);
                if(found.contains(third)){
                    List<Integer> a = new ArrayList<>();
                    a.add(first);
                    a.add(second);
                    a.add(third);
                    Collections.sort(a);
                    res.add(a);
                }
                found.add(second);
            }

        }
        return new ArrayList<>(res);
    }
}