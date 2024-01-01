import java.util.HashMap;
import java.util.Map;

class LeetCode {

    public int unique(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public int[] twoSumIndices(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution :(");
    }

    public static void main(String[] args) {
        LeetCode solution = new LeetCode();

        // Test unique
        int[] nums = {2, 2, 1};
        System.out.println("Unique: " + solution.unique(nums));

        // Test twoSumIndices
        int[] nums2 = {2, 7, 11, 15};
        int target = 9;
        int[] indices = solution.twoSumIndices(nums2, target);
        System.out.println("Two sum indices: " + indices[0] + ", " + indices[1]);
    }
}
