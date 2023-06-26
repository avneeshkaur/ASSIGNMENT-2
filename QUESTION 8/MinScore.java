public class MinScore {
    public static int minScore(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (max - min <= 2 * k) {
            return 0;
        }

        int score1 = Math.max(max - 2 * k, min);
        int score2 = Math.min(max, min + 2 * k);

        return Math.min(score1, score2);
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = minScore(nums, k);
        System.out.println(minScore);
    }
}
