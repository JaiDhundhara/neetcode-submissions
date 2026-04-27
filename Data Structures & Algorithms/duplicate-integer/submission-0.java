class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> frq =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(frq.containsKey(nums[i])){
                return true;
            }
            frq.put(nums[i],frq.getOrDefault(nums[i],0));
        }
        return false;
    }

}