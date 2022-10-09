package boardlayer;

public class Position {

    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int colunm) {
        this.column = colunm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(row);
        sb.append(", ");
        sb.append(column);
        return sb.toString();
    }

}
