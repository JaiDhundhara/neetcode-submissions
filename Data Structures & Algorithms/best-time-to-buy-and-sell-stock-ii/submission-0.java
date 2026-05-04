class Solution {
    public int maxProfit(int[] nums) {
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                res+=nums[i]-nums[i-1];
            }
        }
        return res;
    }
}