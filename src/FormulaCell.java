class FormulaCell extends Cell {
    private String value = "";

    public FormulaCell(String value, Position position) {
        this.value = value;
        this.position = position;
    }

    public Object getValue() {
        // Evaluate the formula expression and return the result
        // (Implementation left to the reader)
        return null;
    }

    public CellType getType() {
        return CellType.FORMULA;
    }
}