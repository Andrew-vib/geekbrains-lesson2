package ru.geekbrains.task2;
import java.util.Arrays;

public class Task2 {
/*
    2. Задать пустой целочисленный массив размером 8.
    Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
*/
    public static void main (String[] args){

        // задаем пустой целочисленный массив на 8 элементов
        int[] arr = new int[8];
       // вызываем метод setArr и передеем ему параметры массива arr
        setArr(arr);
       // выводим данные в массиве
        System.out.print(Arrays.toString(arr));
    }

    public static void setArr ( int[] a){
        // цикл for для массива arr
        for (int i = 0; i < a.length; i++) {
     // передача массиву необходимых для решения задачи элементов
            a[i] = (i * 3) + 1;
        }
    }

}
