package SAK;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    static File file;
    public static ArrayList<String> getFileContent(){
        ArrayList<String> content = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader((file)))) {

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
    public static ArrayList<Cell> openFile(String filename){
        file = new File(filename);


        ArrayList<String> content = FileHandler.getFileContent();


        ArrayList<Cell> cellsM = new ArrayList<Cell>();
        int i = 1;

        //for every line in file
        for (String line : content) {
            if (line.isEmpty()) {
                i++;
                continue;
            }

            int j = 1;
            String[] Cells = line.split(",");

            //for every string (split by ',') in every line in file
            for (String cell : Cells) {
                Position p = new Position(i, j);

                cellsM.add(CellMaker.evaluateInfo(cell, p));
                j++;
            }
            i++;
        }
        return cellsM;
    }
}
