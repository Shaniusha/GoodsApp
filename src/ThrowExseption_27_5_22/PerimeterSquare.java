package ThrowExseption_27_5_22;

public class PerimeterSquare {//периметр квадрата

    public void getPerimeter() {

        Square square = new Square();//создаем наш квадрат

        try {
       square.setSide(-8);
        } catch (PerimeterException e) {
            e.printStackTrace();

            //если необходимо вывести только ошибку с конкретным текстом - для этого ниже
            //вместо  e.printStackTrace();
            System.err.println(e.getMessage());//сторона не верная (получим чисто это смс)
        }
        //заключаем код в try/catch ниже
        //On the Code menu, click Surround With Ctrl+Alt+T.->try/catch
    }
    public void getPerimeter1(String str) throws PerimeterException {//метод: если у пользователя число - это String ,например str = "60.3"
        Square square = new Square();//создаем наш квадрат

        try {
            double side = Double.parseDouble(str);//приводим строку str "60.3" к double 60.3 и тогда мы не попадаем ниже,НО если str "ля-ля" как в main то выпадает ошибка
            square.setSide(0);
        }catch (NumberFormatException e){
            throw new PerimeterException("строка пришедшая от пользователя не верна",e);//в данном методе этО строка str "ля-ля-ля-ля" как в main передоваемая в методе
        } catch (PerimeterException ex) {                                               // e - это Caused-<<причина>>- почему сработало исключение
            System.err.println(ex.getMessage());//сторона не верная
        }
    }
}

