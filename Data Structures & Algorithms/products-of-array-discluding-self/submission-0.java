class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pdt=1;
        int zcnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zcnt++;
            }
            else{
                pdt*=nums[i];
            } 
        }
        int[] res=new int[nums.length];
        Arrays.fill(res,0);
        if(zcnt>1){
            return res;
        }
        else if(zcnt==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    res[i]=pdt;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                res[i]=pdt/nums[i];
            }
        }
    return res;   
    }
}  
