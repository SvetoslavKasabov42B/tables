import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {

    public static ArrayList<String> getFileContent(String fileName){
        ArrayList<String> content = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName.toString()))) {

            String line;
            int counter = 0;

            while ((line = br.readLine()) != null) {
                content.add(line);
                counter++;
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }


        return content;
    }
}
