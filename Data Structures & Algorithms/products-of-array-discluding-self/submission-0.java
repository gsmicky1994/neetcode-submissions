class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] pref = new int[n];
        
        pref[0] = 1;
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1]*nums[i-1];  
        }

        int postSum = 1;
        for(int i=n-1;i>=0;i--){
            pref[i]*=postSum;
            postSum *= nums[i];
        }

        return pref;

    }
}  
