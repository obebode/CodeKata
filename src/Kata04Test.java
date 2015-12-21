import org.junit.Test;

import static org.junit.Assert.*;

public class Kata04Test {

    @Test
    public void testReadFile() throws Exception {

        Kata04 fileInfo = new Kata04();
        String[] lines = fileInfo.ReadFile("/Users/xristol/Downloads/weather.dat");

        for (String line : lines) {
            System.out.println(line);
        }
    }


}