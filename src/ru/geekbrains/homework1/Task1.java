package ru.geekbrains.homework1;

public class Task1 {

    private static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        display(intArray);
        swap(intArray, 0, 2);
        display(intArray);

        String[] strArray = {"s", "t", "r"};
        display(strArray);
        swap(strArray, 0, 1);
        display(strArray);
    }

    private static void display(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(" - ");
    }

}
