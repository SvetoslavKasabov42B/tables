import java.io.File;
import java.util.ArrayList;

/*
4. Празен ред във файла представя празен ред в таблицата. (т.е. ред, в който всички
клетки са празни).
5. Между две запетаи във файла може да няма никакви данни. По този начин се
представя празна клетка.
 6. Между данните и запетаите може да има произволен брой празни

Цяло число – поредица от цифри, без никакви други символи между тях. В началото на
числото може да има знак '+' или '-'. Например:

Дробно число – поредица от цифри, следвана от символ за точка и след нея друга
поредица от цифри. В началото на числото може да има знак '+' или '-'l. Например:

Символен низ (стринг) – поредица от произволни символи оградени в кавички. Подобно
на низовете в C++, ако искате да включите символа за кавичка в даден низ, трябва да го
представите като \", а ако искате да включите наклонена черта, трябва да я представите
като \\. Например:
"Hello world!"
"C:\\temp\\"
"\"This is a quotation\""

Формула – формулата винаги започва със символ за равенство. В нея могат да участват
следните операции: събиране (+), изваждане (-), умножение (*), деление (/) и степенуване
(^). Във формулата могат да участват или числа или препратки към клетки в таблицата.
Ако във формулата участва препратка към клетка, на това място в изчислението трябва
да се използва стойността съхранена в дадената клетка. Повече информация за
формулите е дадена по-долу.


Функции:

Извеждане на таблицата на екрана

Редактиране на клетки

Формули :
Номерата на редовете и клетките в таблицата започват от 1. Препратка към ред <N> и
колона <M> в таблицата се записва така: R<N>C<M>. Например клетката в ред 10 и
колона 5 се представя като R10C5.
*/

public class Main {
    public static void main(String[] args) {

        File testFile = new File("C:\\Users\\Svetoslav Kasabov\\Desktop\\UNI\\OOP\\V PROCESS NA OBRABOTKA\\project2\\src\\inputFile.txt");

        ArrayList<String> content = FileHandler.getFileContent(testFile);


        ArrayList<Cell> cellsM = new ArrayList<Cell>();

        int i = 1;

        for (String line : content) {
            if (line.isEmpty()) {
                i++;
                continue;
            }

            int j = 1;
            String[] Cells = line.split(",");
            for (String cell : Cells) {
                Position p = new Position(i, j);

                cellsM.add(CellMaker.evaluateInfo(cell, p));
                j++;
            }
            i++;
        }


        int bCell = 0;
        int longestL = 0;

        for(Cell cell:cellsM){
            if(cell.position.getCol()>longestL){
                longestL=cell.position.getCol();
            }
            if (bCell < cell.getValue().toString().length() + cell.getValue().toString().length()%4) {
                bCell = cell.getValue().toString().length() + cell.getValue().toString().length() % 4;
            }
        }

        //print table


        Position lCell = new Position(1,1);

        for(Cell cell :cellsM){

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
    }
}
