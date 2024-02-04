import java.util.HashMap;

public class twoSumTest {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i, j;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                j = map.get(target - nums[i]);
                if (i != j) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
