class StringCell extends Cell {
    private String value = "";

    public StringCell(String value, Position position) {
        this.value = value;
        this.position = position;
    }

    public Object getValue() {
        return value;
    }

    public CellType getType() {
        return CellType.STRING;
    }
}