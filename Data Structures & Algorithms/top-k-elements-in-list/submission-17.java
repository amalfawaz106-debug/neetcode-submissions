class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> res = new HashMap<>();
        for(int n : nums){
            if(!res.containsKey(n)){
                res.put(n, 1);
            }
            else{
                int j = res.get(n);
                res.put(n , j + 1);
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a , int[] b){
                return a[0] - b[0];
            }
        });
        for(int n : res.keySet()){
            int j = res.get(n);
            pq.add(new int[]{j,n});
        }
        while(pq.size() > k){
            pq.remove();
        }
        int[] a = new int[k];
        int p =0;
        while(!pq.isEmpty()){
            a[p++] = pq.remove()[1];
        }
        return a;
    }
}
