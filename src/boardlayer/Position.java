package boardlayer;

public class Position {

    private int row;
    private int colunm;

    public Position(int row, int colunm) {
        this.row = row;
        this.colunm = colunm;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColunm() {
        return colunm;
    }

    public void setColunm(int colunm) {
        this.colunm = colunm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(row);
        sb.append(", ");
        sb.append(colunm);
        return sb.toString();
    }

}
