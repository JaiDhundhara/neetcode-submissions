class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> cnt=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(cnt.containsKey(target-nums[i])){
                return new int[]{cnt.get(target-nums[i]),i};
            }
            cnt.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
