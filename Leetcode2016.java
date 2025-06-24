public class Leetcode2016 {
    class Solution {
        public int maximumDifference(int[] nums) {
            int n = nums.length;
            int temp = -1;
            int flag = Integer.MAX_VALUE;

            for(int i=0 ; i<n ; i++){
                flag = Math.min(flag,nums[i]);

                if(flag < nums[i]){
                    temp = Math.max(temp, nums[i] - flag);
                }
            }

            if(temp == -1) return -1;
            return temp;
        }
    }
}
