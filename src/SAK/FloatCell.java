package SAK;

class FloatCell extends Cell {
    private float value = 0;

    public FloatCell(float value, Position position) {
        this.value = value;
        this.position = position;
    }

    public Object getValue() {
        return value;
    }

    public CellType getType() {
        return CellType.FLOAT;
    }
}