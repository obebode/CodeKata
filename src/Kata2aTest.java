import org.junit.Test;

import static org.junit.Assert.*;


public class Kata2aTest {

    @Test
    public void testChop() throws Exception {

        Kata2a searcher = new Kata2a();
        int arr[] = {1, 3, 5};
        int b[] = {1, 3, 5, 7};

        assertEquals(0, searcher.chop(1, arr));

        assertEquals(1, searcher.chop(3, arr));
        assertEquals(2, searcher.chop(5, arr));
        assertEquals(-1, searcher.chop(0, arr));
        assertEquals(-1, searcher.chop(2, arr));
        assertEquals(-1, searcher.chop(4, arr));
        assertEquals(-1, searcher.chop(6, arr));

        assertEquals(0,  searcher.chop(1, b));
        assertEquals(1,  searcher.chop(3, b));
        assertEquals(2,  searcher.chop(5, b));
        assertEquals(3,  searcher.chop(7, b));
        assertEquals(-1,  searcher.chop(0, b));
        assertEquals(-1,  searcher.chop(2, b));
        assertEquals(-1,  searcher.chop(4, b));
        assertEquals(-1,  searcher.chop(6, b));
        assertEquals(-1,  searcher.chop(8, b));

    }
}