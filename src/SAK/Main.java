package SAK;

import SAK.CLI.CommandLineInterface;

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
    public static void main(String[] args) throws Exception {

        /*File testFile = new File(".\src\inputFile.xml");

        ArrayList<String> content = FileHandler.getFileContent(testFile);


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
            for (String asdcell : Cells) {
                Position p = new Position(i, j);

                cellsM.add(CellMaker.evaluateInfo(cell, p));
                j++;
            }
            i++;
        }

        //print table
        Position lCell = new Position(1,1);
        Printer p = new Printer(cellsM);
        p.printTable();
        */

        boolean flag = true;

        while (flag){
            CommandLineInterface cli = new CommandLineInterface();
            flag = cli.run();
        }
    }
}
