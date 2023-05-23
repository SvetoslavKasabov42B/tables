package SAK.CLI;

import SAK.Cell;
import SAK.CellMaker;
import SAK.FileHandler;
import SAK.Printer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommandLineInterface {

    static ArrayList<Cell> table = new ArrayList<Cell>();
    public boolean run() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting");
                return false;
            }else{
                flag = processCommand(input);
            }

        }
        scanner.close();
        return true;
    }


    private boolean processCommand(String command) throws Exception {
        String[] tokens = command.split(" ");
        String action = tokens[0].toLowerCase();

        switch (action) {

            case "print":
                print();
                break;
            case "edit":
                edit();
                break;
            case "help":
                help();
                break;
            case "open":
                open(tokens[1]);
                break;
            case "close":
                close();
                break;
            case "save":
                save();
                break;
            case "saveas":
                saveas(tokens[1]);
                break;
            default:
                System.out.println("Unknown command: " + action);
                break;
        }
        return true;
    }

    private void edit() {
    }

    private void print() {
        Printer p = new Printer(table);
        p.printTable();
    }

    private static void open(String token) {
        //open and load table in cellsM
        table = FileHandler.openFile(token);
    }

    private static void saveas(String token) {
        //saves in a file
    }

    private static void save() {
        //saves as sting
    }

    private static void close() {
        table = new ArrayList<Cell>();
    }

    private static void help() {
        System.out.println("Supported commands:");
        System.out.println("Print ( prints the loaded table form a file )");
        System.out.println("Edit <RowNumber> <ColumnNumber> <NewCellContent>( Takes the inputted content and saves it in the specified cell )");
        System.out.println("Open <FileName> ( opens and reads a file )");
        System.out.println("Close ( closes the file )");
        System.out.println("Save ( saves the changes if any are made )");
        System.out.println("SaveAs <FilePath> <FileName>  ( saves the changes in another file )");
        System.out.println("Exit ( closes the program )");

    }
}
