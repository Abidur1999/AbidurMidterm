package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */

        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int z = 0;
        int n = array.length;

        int[] missiingNumber = new int[10];

        for (int j = 1; j <= n; j++) {
            for (int i = 0; i < n; i++) {

                if (j == array[i]) {
                    break;
                } else if (j != array[i] && i == n - 1) {
                    missiingNumber[z] = j;
                    z++;
                }
            }

        }

        System.out.println("Missing numbers:");
        for (int y = 0; y < z; y++) {
            System.out.println(missiingNumber[y]);
        }

    }
}



