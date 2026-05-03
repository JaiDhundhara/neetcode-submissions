class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> cnt=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            cnt.put(nums[i],cnt.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        cnt.forEach((key,value)->{
            if (bucket[value] == null) bucket[value] = new ArrayList<>();
            bucket[value].add(key);
        });
        int []res =new int[k];
        int cntt=0;
        for(int i=bucket.length-1;i>=0 && cntt < k;i--){
            if(bucket[i] != null){
                for (int val : bucket[i]) {
                    if (cntt < k) res[cntt++] = val;
                }
            }
        }
        return res;

    }
}
