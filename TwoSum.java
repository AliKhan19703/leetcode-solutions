import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return output;
    }
}
public class TwoSum {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums = {2,4,5,7};
        System.out.println(Arrays.toString(s.twoSum(nums, 9)));
    }
}
