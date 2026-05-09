// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         if(nums.length<3) return  new ArrayList();
//         if(nums.length==3){
//             if(nums[0]+nums[1]+nums[2]==0){
//                 return new ArrayList(Arrays.asList(nums[0],nums[1],nums[2]));
//             }
//             else{
//                 return  new ArrayList();
//             }
//         }
//         // int i=0;
//         // int j=1;
//         // int k=2;
//         HashSet<HashMap<Integer,Integer>> sum=new HashSet<>();
//         HashSet<List<Integer>> r= new HashSet<>();
//         // while(i<nums.length-2){
//         //     while(j<nums.length-1){
//         //         while(k<nums.length){
//         for(int i=0;i<nums.length-2;i++){
//             for(int j=1;j<nums.length-1;j++){
//                 for(int k=2;k<nums.length;k++){
//                     if (k < nums.length) {
//                         System.out.println(String.format(
//                             "i:%d j:%d k:%d | nums[%d]=%d, nums[%d]=%d, nums[%d]=%d | Sum: %d",
//                             i, j, k, 
//                             i, nums[i], j, nums[j], k, nums[k], 
//                             (nums[i] + nums[j] + nums[k])
//                         ));
//                     }
//                     if(nums[i]+nums[j]+nums[k]==0){
//                         HashMap<Integer,Integer> temp= new HashMap<>();
//                         temp.put(nums[i],temp.getOrDefault(nums[i],0)+1);
//                         temp.put(nums[j],temp.getOrDefault(nums[j],0)+1);
//                         temp.put(nums[k],temp.getOrDefault(nums[k],0)+1);
//                         if(!sum.contains(temp)){
//                             sum.add(temp);
//                             List<Integer> t=new ArrayList<>();
//                             t.add(nums[i]);
//                             t.add(nums[j]);
//                             t.add(nums[k]);
//                         }
//                         // i=i+1;
//                         // j=i+1;
//                         // k=j+1;
//                     }
//                     // else{
//                         // k++;
//                     // }
//                 }
//                 // j++;
//             }
//             // i++;
//         }
//         List<List<Integer>> res=new ArrayList<>();
//         for(List a:r){
//             res.add(a);
//         }
//         return res;

//     }
// }


public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}