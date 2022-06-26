package com.ozerov.lesson02;

import java.util.Random;

public class Main {
    private static final int DIMENSION_ARRAY = 4;
    private static final int REQUIRED_SIZE_ARRAY = 4;
    private static final int LOWER_RANGE_VALUE = 48;
    private static final int UPPER_RANGE_VALUE = 60;
    private static final String SUM_OF_NUMBERS_IN_ARRAY = "Сумма чисел в массиве равна ";

    public static void main(String[] args) {
        String[][] array = initializeArray(DIMENSION_ARRAY);

        try {
            if (!isArrayValid(array)) {
                throw new MyArraySizeException(array);
            }
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
            int sum = 0;
            int number;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    try {
                        number = Integer.parseInt(array[i][j]);

                    } catch (NumberFormatException exception) {
                        exception.printStackTrace();
                        try {
                            throw new MyArrayDataException(i, j);
                        } catch (MyArrayDataException e) {
                            e.printStackTrace();
                            number = 0;
                        }
                    }
                    sum = sum + number;
                }
            }
            System.out.println(SUM_OF_NUMBERS_IN_ARRAY + sum);
    }

    private static String[][] initializeArray(int dimension) {
        String[][] initArray = new String[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                initArray[i][j] = generatedString();
            }
        }
        return initArray;
    }

    private static String generatedString() {
        Random random = new Random();
        int generatedIntValue = random.nextInt(LOWER_RANGE_VALUE, UPPER_RANGE_VALUE);
        return String.valueOf((char) generatedIntValue);
    }

    private static boolean isArrayValid(String[][] array) {
        return ((array.length == REQUIRED_SIZE_ARRAY)
                & (array[0].length == REQUIRED_SIZE_ARRAY));
    }
}
