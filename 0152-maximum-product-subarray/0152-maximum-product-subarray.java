class Solution {
    public int maxProduct(int[] nums) {
        int best=nums[0];
        int n=nums.length;
        int left=1,right=1;
        for(int i=0;i<n;i++){
            if(left==0){
                left=1;
            }
            if(right==0){
                right=1;
            }
            left*=nums[i];
            right*=nums[n-1-i];
            best=Math.max(best,Math.max(left,right));
        }
        return best;
    }
}