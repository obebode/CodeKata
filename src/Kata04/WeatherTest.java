package Kata04;

import org.junit.Test;

public class WeatherTest {

    @Test
    public void testReadFile() throws Exception {

        Weather fileInfo = new Weather();
        String[] lines = fileInfo.ReadFile("/Users/xristol/Downloads/weather.dat");


        for (String line : lines) {
            System.out.println(line);
        }

    }

}