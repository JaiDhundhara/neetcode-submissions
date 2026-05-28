class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> cnt =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(cnt.contains(nums[i])){
                return nums[i];
            }
            cnt.add(nums[i]);
        }
        return -1;
    }
}
