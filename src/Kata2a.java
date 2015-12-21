

// Recursion algorithm
public class Kata2a {

    public Kata2a() {
    }

    public static int chop(int i, int[] array_of_int) {
        return chop(i, array_of_int, 0, array_of_int.length - 1);
    }

    public static int chop(int i, int[] array_of_int, int lowerBound, int upperBound) {
        int currentIndex = (lowerBound + upperBound) / 2;
        if (array_of_int[currentIndex] == i) {
            return currentIndex;
        } else if (lowerBound > upperBound) {
            return -1;
        } else {
            if (array_of_int[currentIndex] > i) {
                return chop(i, array_of_int, lowerBound, currentIndex - 1);
            } else {
                return chop(i, array_of_int, currentIndex + 1, upperBound);
            }
        }

    }
}

