class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int n=0;
        while(i<nums.length){
            if(nums[i]!=0){
            nums[n]=nums[i];
            n++;
            }
            i++;
        }
        while(n<nums.length){
        nums[n]=0;
        n++;
        }
    }
}