import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> content= FileHandler.getFileContent("inputFile.txt");
        for (String line:content) {

        System.out.println("");
        System.out.print("|");
        String[] fields = line.split(",\\s*");
        for (String field : fields) {


            //add field size
            if (field.trim().isEmpty()) {
                System.out.print("\t|");
            } else {
                System.out.print(field.trim() + "\t|");
            }
        }
        }
    }
}

