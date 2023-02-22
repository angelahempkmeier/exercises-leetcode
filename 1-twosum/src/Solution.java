import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        List<Integer> index = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
               for(int j = i + 1; j <nums.length; j++){
                   if(nums[i] + nums[j] == target){
                       index.add(i);
                       index.add(j);
                   }
               }
            }

        int[] indices = new int[index.size()];
        for(int i = 0; i < indices.length; i++){
            indices[i] = index.get(i);
        }

        return indices;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{3,2,4};

        System.out.println(s.twoSum(nums, 6).toString());
    }
}
