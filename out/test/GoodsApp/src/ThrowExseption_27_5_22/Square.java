package ThrowExseption_27_5_22;
// Урок . Создание собственных исключений. Оператор throw

//необходимо вычислить периметр квадрата по значению его стороны.
// Например пользователь вводит 0 или отрицательное число
//Что тогда делать?
public class Square {//квадрат
    private double side;//задаем сторону квадрата

    public void setSide(double side) throws PerimeterException { // throw (бросаем)
        if (side <= 0){//если сторона <0, то мы бросаем ошибку
            // throw (бросаем) исключение и создаем обЪект с нашим исключением new PerimeterException()
            throw new PerimeterException("сторона не верная");//то мы бросаем ошибку
            //подсвечивает красным-нажать на него-слева появляется красрая лампочка -выбрать add exception to...
            //подсвечивает красным-нажать на него-слева появляется красрая лампочка-выбрать surround with try/catch


        }
    }
    public Square() {

    }

    public double getSide() {
        return side;
    }

    //генерируем конструктор
    public Square(double side) {
        this.side = side;
    }
}
