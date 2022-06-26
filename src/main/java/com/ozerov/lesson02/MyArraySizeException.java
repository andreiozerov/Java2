package com.ozerov.lesson02;

public class MyArraySizeException extends Exception {
    private static final String ARRAY_IS_NOT_VALID =
            "Массив размерности [ %s ][ %s ] не удовлетворяет условиям задачи. ";

    public MyArraySizeException() {
        System.out.println(ARRAY_IS_NOT_VALID);
    }

    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(Throwable cause) {
        super(cause);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyArraySizeException(String[][] array) {
        super(String.format(ARRAY_IS_NOT_VALID, array.length, array[0].length));
    }
}
