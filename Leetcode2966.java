import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode2966 {

    class Solution {
        public int[][] divideArray(int[] nums, int k) {
            Arrays.sort(nums);
            boolean flag = false;
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();

            for(int i=0 ; i<nums.length ; i+=3){
                if(nums[i+2] - nums[i] <= k){
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[i+1], nums[i+2])));
                }
                else{
                    flag = true;
                    break;
                }
            }

            if(flag){
                return new int[0][0];
            }
            else{
                int[][] output = new int[result.size()][3];
                for(int i = 0; i < result.size(); i++){
                    for(int j = 0; j < 3; j++){
                        output[i][j] = result.get(i).get(j);
                    }
                }

                return output;
            }
        }
    }
}