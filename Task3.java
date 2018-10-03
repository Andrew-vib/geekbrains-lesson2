package ru.geekbrains.task3;

import java.util.Arrays;

public class Task3 {
 /*
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
 написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
*/

        public static void main (String[] args) {
            // создаем массиву arr и записываем в него элементы
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            // вызываем метод setArr и передеем ему параметры массива arr
            setArr(arr);
            // выводим данные в массиве
            System.out.println(Arrays.toString(arr));
        }

        // создание метода, который умножает элементы меньшие 6 на 2
            public static void setArr (int [] arr) {
            // цикл for для массива arr
                for (int i = 0; i < arr.length; i++) {
            // поиск элементов значение, которых меньше 6, умножание их на 2 и перезаписываем значение элементов
                    if (arr[i] < 6) arr[i] *= 2;
            }
        }
}
