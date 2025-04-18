import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = {0, 0};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
