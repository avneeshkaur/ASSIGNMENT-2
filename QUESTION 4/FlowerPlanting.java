public class FlowerPlanting {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                boolean prevEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == length - 1) || (flowerbed[i + 1] == 0);

                if (prevEmpty && nextEmpty) {
                    count++;
                    flowerbed[i] = 1;
                }

                if (count >= n) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean canPlant = canPlaceFlowers(flowerbed, n);
        System.out.println(canPlant);
    }
}
