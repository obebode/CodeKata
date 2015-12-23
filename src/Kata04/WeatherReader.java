package Kata04;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeatherReader {

    public static String[] ReadFile(String filename) throws IOException {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> lines = null;

        try {
            fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);
            lines = new ArrayList<String>();

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                //lines.add(line);
                String elements[] = line.split("");
                final String Dy = elements[0];
                final String MxT = elements[1];
                final String MnT = elements[2];

                return new Weather(
                        Integer.parseInt(Dy),
                        Integer.parseInt(MxT),
                        Integer.parseInt(MnT)

                );

            }
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }

        return lines.toArray(new String[lines.size()]);
    }
}
