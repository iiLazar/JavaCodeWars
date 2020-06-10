package successfulkata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KataArrayMaxSum5 {

    public static class Max {
        public static int sequence(int[] arr) {

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                List<Integer> sumsList = new ArrayList<>();
                int localSum = arr[i];

                for (int j = i + 1; j < arr.length; j++) {
                    localSum += arr[j];
                    sumsList.add(localSum);
                }

                if (sumsList.size() > 0) {
                    Collections.sort(sumsList);
                    int maxSum = sumsList.get(sumsList.size() - 1);
                    if (maxSum > sum) {
                        sum = maxSum;
                    }
                }
            }

            return sum > 0 ? sum : 0;
        }
    }


    public static void main(String[] ar) {

        System.out.println(Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
//        System.out.println(Max.sequence(new int[]{-1,2,3,4}));




    }
}
