package boardlayer;

import boardlayer.exceptions.BoardException;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int colunms) {
        if (rows < 1 || colunms < 1) {
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }

        this.rows = rows;
        this.columns = colunms;
        pieces = new Piece[rows][colunms];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece getPiece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    public Piece getPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece on position "+ position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Boolean positionExists(int row, int column) {
        return row >= 0 && row <= rows && column >= 0 && column < columns;
    }

    public Boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public Boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return getPiece(position) != null;
    }
}

