package ru.geekbrains.homework6;

public class task2 {
    public boolean task2(int[] data) {
        boolean contains1 = false;
        boolean contains4 = false;

        for (int i = 0; i < data.length; i++) {
            switch (data[i]) {
                case 1:
                    contains1 = true;
                    break;
                case 4:
                    contains4 = true;
                    break;
                default:
                    return false;
            }
        }
        return contains1 && contains4;
    }
}
