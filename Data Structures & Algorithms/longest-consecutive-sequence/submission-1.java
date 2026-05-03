class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> prsnt= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            prsnt.add(nums[i]);
        }
        int cnt=0;
        for(int num:prsnt){
            if(!prsnt.contains(num-1)){
                int curr=num;
                int tcnt=1;
                while(prsnt.contains(curr+1)){
                    tcnt++;
                    curr++;
                }
                if(tcnt>cnt) cnt=tcnt;
            }
        }
        return cnt;
    }
}
