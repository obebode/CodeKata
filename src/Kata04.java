import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kata04 {

    public String[] ReadFile(String filename) throws IOException {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> lines = null;

        try {
            fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);
            lines = new ArrayList<String>();

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
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
