class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>cnt =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            cnt.put(nums[i],cnt.getOrDefault(nums[i],0)+1);
        }
        List<Integer> res=new ArrayList<>();
        cnt.forEach((key,value)->{
            if(value>nums.length/3){
            res.add(key);
            }
        });
        return res;
    }
}