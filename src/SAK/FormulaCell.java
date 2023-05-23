package SAK;

class FormulaCell extends Cell {
    private String value = "";

    public FormulaCell(String value, Position position) {
        this.value = value;
        this.position = position;
    }
    public Object getValue() {
    return value;
    }



    public CellType getType() {
        return CellType.FORMULA;
    }

}