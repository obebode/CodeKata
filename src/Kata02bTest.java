import org.junit.Test;

import static org.junit.Assert.*;


public class Kata02bTest {

    @Test
    public void testChop() throws Exception {

        Kata02b searcher = new Kata02b();
        int arr[] = {1, 3, 5};
        int b[] = {1, 3, 5, 7};

        assertEquals(0, searcher.chop(arr, 1));

        assertEquals(1, searcher.chop(arr, 3));
        assertEquals(-1, searcher.chop(arr, 0));

        assertEquals(0, searcher.chop(b, 1));
        assertEquals(1, searcher.chop(b, 3));
        assertEquals(2, searcher.chop(b, 5));

        assertEquals(-1, searcher.chop(b, 0));
    }
}