import java.util.Arrays;

public class Leetcode2294 {

    class Solution {
        public int partitionArray(int[] nums, int k) {
            Arrays.sort(nums);
            int n = nums.length;
            int i=0, j=0;
            int count = 0;

            while(j<n){
                if(nums[j] - nums[i] <= k){
                    j++;
                }
                else{
                    i=j;
                    count++;
                }
            }

            return count+1;
        }
    }
}