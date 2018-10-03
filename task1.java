package ru.geekbrains.task1;

import java.util.Arrays;

public class task1 {
    /*
    1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    */
    public static void main(String[] args) {

        int[] a = {1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0};
     // вызываем метод setArr и передеем ему параметры массива arr
        setArr(a);
     // выводим данные в массиве
        System.out.println(Arrays.toString(a));
    }

    public static void setArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
      // поиск элементов массива имеющих значение 0 и замена значений на 1
            if (a[i] == 0) a[i] = 1;
      // поиск элементов массива имеющих значение 1 и замена значений на 0
            else if (a[i] == 1) a[i] = 0;
        }
    }
}
