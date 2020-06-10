package successfulkata;

public class ArrSquare {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 1};
        int[] arrayB = {1, 4, 9, 1, 16};
        System.out.println(AreSame.comp(arrayA, arrayB));
    }
}

class AreSame {

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;
//        for each a[i] check if a[i]^2 == b[j] for each b[j] until equal value found
//        if true, remove/replace b[j] value and go to next a[i]
//        (multiple a[i] values could equal a single b[j])
//        that requires a local, mutable array == b before check starts

//        if no b[i] found return false
//        if all a[i] values have a match @b return true

        int[] localB = b;
        final int USED_NUMBER = 0; // there is no way number^2 == 0
        for (int number : a) {
            boolean foundB = false;
            for (int i = 0; i < localB.length; i++) {
                if (number*number == localB[i]) {
                    localB[i] = USED_NUMBER;
                    foundB = true;
                    break;
                }
            }
            if (!foundB) return false;
        }
        return true;
    }
}