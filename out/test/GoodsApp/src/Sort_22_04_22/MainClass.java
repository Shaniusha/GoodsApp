package Sort_22_04_22;

import java.util.Arrays;
//Алгоритмы сортировки в Java
// нужно посмотреть гарвардский курс cs50 на русском. все серии 

public class MainClass {

    public static void main(String[] args) {
        int[] unsortedArray = {2, 1, 4, 8, 7, 5, 6, 3};

        System.out.println("Не отсортированный массив");
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println();

        choiceSort(unsortedArray);
        bubbleSort(unsortedArray);
        insertSort(unsortedArray);
    }

    //метод : сортировка ВЫБОРОМ
    public static void choiceSort(int[] arrayTosort) {
        int[] array = Arrays.copyOf(arrayTosort, arrayTosort.length);

        //Проходим по массиву
        //Найти минимальный элемент
        //Меняем местами 1-ый неотсортированный эл-т массива и минимальныйый эл-т
        //Повторяем пока не пройдем по всему массиву

        long start = System.nanoTime();//замеряем время для выполнения

        int indexMin;//индекс мини-ого эл-та

        //набрать на клаве fori(заготовка for)
        //проход по массиву
        //length - 1  (потому что если последний эл-т то его нескем сравнивать)

        for (int index = 0; index < array.length - 1; index++) {
            indexMin = index;//порядковый номер первого нашего эл-та
            //нам нужно сравнить эл-т index с каждым из след-их эл-ов массива
            //находим индекс минимального эл-та  indexMin
            for (int indexToSсan = index; indexToSсan < array.length; indexToSсan++) {
                if (array[indexMin] > array[indexToSсan]) {//Сравниваем значения и если indexMin >,то
                    indexMin = indexToSсan;                  //indexToSсan теперь минимальный эл-т
                }
            }
            //Меняем местами 1-ый эл-т который находится в позиции index с минимальным
            int temp = array[index];
            array[index] = array[indexMin];
            array[indexMin] = temp;
        }
        long finish = System.nanoTime();
        System.out.println("Сортировка массива *ВЫБОРОМ*");
        System.out.println("Выводим разницу времени: " + (finish - start));
        String print = Arrays.toString(array);//метод для распечатывания массива
        System.out.println(print);
    }

    //метод : сортировка ПУЗЫРЬКОМ
    public static void bubbleSort(int[] arrayToSort) {
        int[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);

        //пройти по массиву
        //сравнить два соседних эл-та
        //повторить это действие пока не отсортируем

        long start = System.nanoTime();//замеряем время для выполнения

        int changeCounter;//счетсчик изменений

        do {
            changeCounter = 0;//при первом проходе кол-во перестановок = 0
            //проход по массиву
            // length - 1  (потому что если последний эл-т то его нескем сравнивать)
            for (int index = 0; index < arrayToSort.length - 1; index++) {
                if (arrayToSort[index] > arrayToSort[index + 1]) {
                    //Меняем местами 1-ый эл-т который находится в позиции index с минимальным
                    int temp = arrayToSort[index];
                    arrayToSort[index] = arrayToSort[index + 1];
                    arrayToSort[index + 1] = temp;
                    changeCounter++;// при каждой перестановки увеличиваем счетсчик на 1
                }
            }
        } while (changeCounter > 0);

        long finish = System.nanoTime();
        System.out.println("");
        System.out.println("Отсортированный массив ПУЗЫРЬКОВЫМ :) способом");
        System.out.println("Выводим разницу времени: " + (finish - start));
        System.out.println(Arrays.toString(arrayToSort));
    }
    // метод : сортировка ВСТАВКАМИ
    public static void insertSort(int[] arrayToSort){
        int[] array = Arrays.copyOf(arrayToSort, arrayToSort.length );

        //проход по массиву
        //выбираем эл-т
        //устанавливаем эл-т на законное место

        long start = System.nanoTime();//замеряем время для выполнения

        int element;//тот эл-т кот-ый мы выбираем для того чтобы проверить где он должен находиться и установить
        int indexToInsert;//(индекс для вставки)индекс в отсорт-ой часте массиве куда мы установим наш эл-т

        //проход по массиву
        for (int index = 0; index < array.length; index++) {
            element = array[index];
            indexToInsert = index;

            while (indexToInsert > 0
            && array[indexToInsert - 1] > element){ //выбираем эл-т
                array[indexToInsert] = array[indexToInsert - 1];//устанавливаем эл-т на законное место
                indexToInsert--;
                array[indexToInsert] = element;
            }
        }
        long finish = System.nanoTime();
        System.out.println("");
        System.out.println("Метод : сортировка ВСТАВКАМИ" );
        System.out.println("Выводим разницу времени: " + (finish - start));
        System.out.println(Arrays.toString(array));
    }
}



