package com.ozerov.lesson02;

public class MyArrayDataException extends Exception {
    private static final String INCORRECT_DATA_IN_A_CELL = "Неверные данные в ячейке [ %s ][ %s ].";

    public MyArrayDataException() {
    }

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(Throwable cause) {
        super(cause);
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyArrayDataException(int row, int column) {
        super(String.format(INCORRECT_DATA_IN_A_CELL, row, column));
    }
}
