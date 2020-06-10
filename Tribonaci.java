package successfulkata;

import java.util.Arrays;

public class Tribonaci {
    public static void main(String[] args) {
        double[] array = {1,2,4,7,13,24};
        System.out.println(Arrays.toString(Xbonacci.tribonacci(array, 8)));
    }
}


class Xbonacci {

    public static double[] tribonacci(double[] s, int n) {
        /*
        * array to be returned (outputArray) will have n elements;
        * if n==0 return empty OutputArray;
        * if n == 1 || 2 ( || 3 optionally) => outputArray is short, only takes n elements from input array and returns outputArray;
        * //that could be a switch;
        * if not short, take first 3 elements of passed array, assign them to the array to be returned (i = [0,1,2]);
        * repeat calculation of each element from index 3 to n-1;
        * calculation: outputArray[i] = sum of 3 previous elements: [i-3] + [i-2] + [i-1];
        * return outputArray
        * */
        if (n==0) return new double[0];

        double[] outputArray = new double[n];
        boolean isShort = n == 1 || n == 2 || n == 3;

        if (isShort) {
            for (int i = 0; i < n; i++) {
                outputArray[i] = s[i];
            }
            return outputArray;
        }

        for (int i = 0; i < 3; i++) {
            outputArray[i] = s[i];
        }

        for (int i = 3; i < n; i++) {
            outputArray[i] = outputArray[i - 3] + outputArray[i - 2] + outputArray[i - 1];
        }

        return outputArray;
    }
}