class Solution {
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        int x=k%nums.length;
        System.out.println("i " + i+" j "+j+" k "+k+" x "+x);
        reverse(nums,i,j);
        reverse(nums,x,j);
        reverse(nums,i,x-1);
    }
}