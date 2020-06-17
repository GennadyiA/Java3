package ru.geekbrains.homework6;

import java.util.Arrays;

public class task1 {
    public int[] task1(int[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] == 4) {
                return Arrays.copyOfRange(data, i + 1, data.length);
            }
        }
        throw new RuntimeException("Invalid array");
    }
}
