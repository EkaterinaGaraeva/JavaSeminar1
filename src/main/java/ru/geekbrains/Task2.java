package ru.geekbrains;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1};
        int count = 0;
        int max = 0;
        for (int item : arr) {
            if (item == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.printf("Наибольшая последовательность 1 = %d", max);
    }
}
