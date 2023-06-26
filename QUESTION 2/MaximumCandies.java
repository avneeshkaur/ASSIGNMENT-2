import java.util.HashSet;
import java.util.Set;

public class MaximumCandies {
    public static int maxCandies(int[] candyType) {
        Set<Integer> uniqueCandies = new HashSet<>();
        int maxCandies = candyType.length / 2;
        
        for (int candy : candyType) {
            uniqueCandies.add(candy);
            if (uniqueCandies.size() >= maxCandies) {
                return maxCandies;
            }
        }
        
        return uniqueCandies.size();
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxTypes = maxCandies(candyType);
        System.out.println(maxTypes);
    }
}
