package ThrowExseption_27_5_22;

public class PerimeterException extends Exception{//создаем свою собственную щшибку и наследуемся от класса Exception

    //генерируем все конструкторы которые есть у класса Exception
    public PerimeterException() {//пустой конструктор

    }

    public PerimeterException(String message) {//принимает см скоторое мы хотим передать пользователю

        super(message);
    }

    public PerimeterException(String message, Throwable cause) {//смс с причиной
        super(message, cause);
    }

    public PerimeterException(Throwable cause) {//причина
        super(cause);
    }

    public PerimeterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
