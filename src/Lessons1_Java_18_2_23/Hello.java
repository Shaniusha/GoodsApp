package Lessons1_Java_18_2_23;
//я вспоминаю Java с этого урока

public class Hello {
    public static void main(String [] args){
                                        //1
        //sout = System.out.println
        System.out.println("Hello world!");

                                       //2. Типы данных: это примитивные
        int myInt;//целые числа
        myInt = 55;
        System.out.println(myInt + 77);// 132

        short myShort = 3266;//вмещает в себя информацию 16-ти битных чисел от -32000 до +32000
        long myL = 12345678;//64-ех битные числа
        double myD = 234.56;//64-ех битные числа
        float myF = 234.56f;//32 битные числа

        char myC = 'a';//симол

        boolean b = true;//или false

        byte myB = 127;//8 бит информации  от -128 до +127
        System.out.println(myB);

                                      //3. String - строки и это уже Класс поэтому и с большой буквы
                                      //Ссылочные типы данных
        String st = "Shanya";//String-Класс
                            //s-переменная которая ссылается на обЪект
                            //"Shanya"-обЪект созданный из класса String

        String enter = " ";
        String h = "Hello";
        String m = "my";
        String l ="love";
        String bi = "big";

        String k = "kotik !!!";
        String y = "you";

        //Hello Shanya you my big love kotik !!!
        System.out.println(h + enter + st + enter + y + enter + m + " " + bi + enter + l + enter + k);

        //Hello my horrible dream
        System.out.println("Hello" + " my " + "horrible dream");//страшный сон


        //Hello my big salary = 12345678
        System.out.println(h + " " + m + enter + bi + " " + "salary" + enter + "=" + " " + myL);

                                //4. Цикл while

        boolean t = 5 > 2;
        boolean f = 7 < 1;
        boolean t1 = 5 >= 5;
        boolean t2 = 5 == 5;
        System.out.println(t);//true
        System.out.println(f);//false
        System.out.println(t1);//true
        System.out.println(t2);//true

        int value = 0;
        boolean f1 = value > 5;//false

        //Цикл while выполняется до тех пор пока условия в круглых скобках (val < 5) имеют значение true
        int val = 0;
        while (val < 5){
            System.out.println("yes " + val );//получилось 5 циклов от 0 до 4
            val = val + 1;

        }
    }
}
