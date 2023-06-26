import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxLen = 0;
        
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.containsKey(key + 1)) {
                int length = frequencyMap.get(key) + frequencyMap.get(key + 1);
                maxLen = Math.max(maxLen, length);
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int maxLen = findLHS(nums);
        System.out.println(maxLen);
    }
}
