abstract class Cell {
    Position position;
    public abstract Object getValue();
    public abstract CellType getType();

    public static Cell createIntCell(int value,Position position) {
        return new IntCell(value, position);
    }

    public static Cell createStringCell(String value,Position position) {
        return new StringCell(value, position);
    }

    public static Cell createFormulaCell(String value,Position position) {
        return new FormulaCell(value, position);
    }
}