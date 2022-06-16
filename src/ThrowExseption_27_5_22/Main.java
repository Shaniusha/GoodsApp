package ThrowExseption_27_5_22;
// Урок . Создание собственных исключений. Оператор throw

public class Main {
    public static void main(String[] args) throws PerimeterException {
        PerimeterSquare perimeterSquare = new PerimeterSquare();

        //используем метод  getPerimeter   class PerimeterSquare
        perimeterSquare.getPerimeter();

        //используем метод  getPerimeter1   class PerimeterSquare
        try {
            perimeterSquare.getPerimeter1("ля-ля-ля-ля");//если в метод  perimeter1 передать  "ля-ля-ля-ля", то выпадет исключение ниже

        } catch (PerimeterException e) {
            e.printStackTrace();
        }
    }
}
//когда запускем main

//если в class PerimeterSquare
//в методе getPerimeter задать   square.setSide(0);или отрицательное число(-8)
//то выпадет исключение написанное нами
//ThrowExseption_27_5_22.PerimeterException: сторона не верная
//если задаем положительное число то ничего не пишется(т.к все ок)-исключения нет

//.getPerimeter1
// строка пришедшая от пользователя не верна
//For input string: "ля-ля-ля-ля