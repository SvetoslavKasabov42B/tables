package SAK;

class IntCell extends Cell {
    private int value = 0;

    public IntCell(int value, Position position) {
        this.value = value;
        this.position = position;
    }

    public Object getValue() {
        return value;
    }

    public CellType getType() {
        return CellType.INT;
    }
}