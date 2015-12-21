import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class Kata02b {

    public Kata02b() {
    }

    public static int chop(int[] array_of_int, int i) {
        int lowerBound = 0;
        int upperBound = array_of_int.length - 1;
        return binarySearch(array_of_int, lowerBound, upperBound, i);
    }

}
