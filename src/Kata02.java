

public class Kata02 {

    public Kata02() {
    }

    public int chop(int i, int[] array_of_int) {

        int lowerBound = 0;
        int upperBound = array_of_int.length - 1;


        while (true) {
            int currentIndex = (lowerBound + upperBound) / 2;
            if (array_of_int[currentIndex] == i) {
                return currentIndex;   // found it
            } else if (lowerBound > upperBound) {
                return -1;  // can't find it
            } else {
                if (array_of_int[currentIndex] < i) {
                    lowerBound = currentIndex + 1;  // it's in the upper half
                } else {
                    upperBound = currentIndex - 1;  // it's in the lower half
                }
            }

        }
    }

}
