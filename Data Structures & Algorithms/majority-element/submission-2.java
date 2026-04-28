class Solution {
    public int majorityElement(int[] nums) {
        int cnt=1;
        int cele=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==cele){
                cnt++;
            }
            else{
                cnt--;
            }

            if(cnt==0){
            cele=nums[i];
            cnt=1;
            }
        }
        return cele;
    }
}