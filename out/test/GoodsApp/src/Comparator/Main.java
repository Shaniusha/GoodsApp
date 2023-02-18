package Comparator;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {64,42,73,41,32,53,16,24,57,2,4,5,36};
        System.out.println("");
        System.out.println("  <Не отсортированный массив>");
        System.out.println(Arrays.toString(array));
        System.out.println("");

        System.out.println("  <Отсортированный массив (по умолчанию) по возрастанию>");
        Arrays.sort(array);//отсортировать(по умолчанию по возрастанию)
        System.out.println(Arrays.toString(array));
        System.out.println("");

        System.out.println("  <Отсортированный массив по убыванию c помощью revers>");
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println(Arrays.toString(array));
        System.out.println("");


        //создание нового Comparator
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {//сравнить между собой два числа,т.е из одного вычесть другое
                //сортировка по возрастанию
                return o1 - o2;

                //сортировка по убыванию
                // return -(o1 - o2);
                //раскрываем скобки
                //  -o1 + o2
                //    o2 - o1

                //допустим есть два значения: x и y
                //функция compare должна возвращать
                //если x > y, положительное число
                //если x = y, ноль
                //если x < y, отрицательное число
            }
        });
        String c = "  <Отсортированный массив с помощью функции compare,которая есть у interface Comparator>";
        System.out.println(c);
        System.out.println(Arrays.toString(array));

    }
}
