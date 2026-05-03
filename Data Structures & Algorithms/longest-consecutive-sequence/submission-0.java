class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> prsnt= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            prsnt.add(nums[i]);
        }
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int j=0;
            int tcnt=0;
            while(prsnt.contains(nums[i]+j)){
                tcnt++;
                j++;
            }
            if(tcnt>cnt) cnt=tcnt;
        }
        return cnt;
    }
}
