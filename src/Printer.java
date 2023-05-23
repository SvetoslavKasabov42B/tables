import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printer {

    ArrayList<Cell> table;

    public Printer(ArrayList<Cell> cellsM) {
        this.table = cellsM;
    }
    public void printTable() {
        Position lCell = new Position(1,1);
        int bCell = 0;
        int longestL = 0;

        //get line length and size of cells
        for(Cell cell:table){
            if(cell.position.getCol()>longestL){
                longestL=cell.position.getCol();
            }
            if (bCell < cell.getValue().toString().length() + cell.getValue().toString().length()%4) {
                bCell = cell.getValue().toString().length() + cell.getValue().toString().length() % 4;
            }
        }

        for(Cell cell :table){

            if (cell.position.getRow() > lCell.getRow()) {

                while (lCell.getCol() < longestL) {
                    System.out.print(" ".repeat(bCell - 1) + "|");
                    lCell = new Position(lCell.getRow(),lCell.getCol()+1);
                }
                System.out.println("");
            }
            while(cell.position.getRow()>lCell.getRow()+1){
                System.out.println("");
                lCell = new Position(lCell.getRow()+1,lCell.getCol());
            }
            System.out.print(cell.getValue() + " ".repeat(bCell - 1-cell.getValue().toString().length()) + "|");

            //evaluate info()
            lCell = cell.position;

        }
        System.out.println();
    }
}
