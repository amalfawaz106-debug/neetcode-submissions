class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0 ; i<nums.length - 1; i++){
            int first = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            while(left < right){
                int second = nums[left];
                int third = nums[right];
                int sum = first + second + third;
                if(sum ==0){
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(first);
                    a.add(second);
                    a.add(third);
                    res.add(a);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
                
            }
        }
        return res;































        /*Set<List<Integer>> res = new HashSet<>();
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
        return new ArrayList<>(res);*/
    }
}