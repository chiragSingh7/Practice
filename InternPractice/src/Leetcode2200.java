import java.util.ArrayList;

public class Leetcode2200 {
    int flag, temp;
    int j = 0;
    int n = nums.size();
    ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
        if(nums[i] == key){
            if(i-k >= j){
                temp = i-k;
                j = i-k;
            }
            else temp = j;

            if(i+k < n){
                flag = i+k;
            }
            else flag = n-1;

            for( ; j<=flag ; j++){
                if(nums[j] == key && j>temp+k){
                    break;
                }

                ans.add(j);
            }
        }
        else{
            continue;
        }
    }

        return ans;
}
