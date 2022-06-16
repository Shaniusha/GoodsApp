package Calculator_29_5_22;

public class Calculator {
    private Double aDouble;
    private Double bDouble;

//    public static Double plus(Double aDouble, Double bDouble) {
//    }

    public  Double plus() throws InterruptedException {//throws (бросаем) Exception для ожидания времени(ниже)
        Thread.sleep(200);

        if (aDouble != null && bDouble != null)
            return aDouble + bDouble;
        else {
            System.out.println("переменные не заданы правильно - null");
            return null;
        }
    }

    public void setA_Plus(String aDouble) {
        try {
            this.aDouble = Double.parseDouble(aDouble);//преобразовываем пролученный String aDouble в Doubl
        } catch (NumberFormatException e) {//строка не может быть преобразована в Double
            System.out.println("строку   " + aDouble + "   не возможно пребразить в Double");
            aDouble = null;//если преобразование не удалось,то мы присваиваем aDouble null
        }
    }

    public void setB_Plus(String bDouble) {
        try {
            this.bDouble = Double.parseDouble(bDouble);//преобразовываем пролученный String bDouble в Doubl
        } catch (NumberFormatException e) {//строка не может быть преобразована в Double
            System.out.println("строку   " + bDouble + "   не возможно пребразить в Double");
            bDouble = null;
        }
    }

    public Double del() {
        if (aDouble != null && bDouble != null) {
            return aDouble / bDouble;
        } else if (aDouble > 0 && bDouble == 0) {
            return  Double.POSITIVE_INFINITY;
        } else if (aDouble < 0 && bDouble == 0) {
            return  Double.NEGATIVE_INFINITY;
        } else if (aDouble > 0 && bDouble == -0) {
            return  Double.NEGATIVE_INFINITY;
        } else if (aDouble == 0 && bDouble == 0) {
            return  Double.NaN;
        } else {
            System.out.println("переменные не заданы правильно - null");
            return null;
        }
    }

    public void setA_Del(String aDouble) {
        try {
            this.aDouble = Double.parseDouble(aDouble);//преобразовываем пролученный String aDouble в Doubl
        } catch (NumberFormatException e) {//строка не может быть преобразована в Double
            System.out.println("строку   " + aDouble + "   не возможно пребразить в Double");
            aDouble = null;//если преобразование не удалось,то мы присваиваем aDouble null
        }
    }
    public void setB_Del(String bDouble) {
        try {
            this.bDouble = Double.parseDouble(bDouble);//преобразовываем пролученный String bDouble в Doubl
        } catch (NumberFormatException e) {//строка не может быть преобразована в Double
            System.out.println("строку   " + bDouble + "   не возможно пребразить в Double");
            bDouble = null;//если преобразование не удалось,то мы присваиваем bDouble null
        }
    }
    public Double multiply() {
        if (aDouble != null && bDouble != null) {
            return aDouble * bDouble;
        } else {
            System.out.println("переменные не заданы правильно - null");
            return null;
        }
    }

    public void setA_Multiply(String aDouble) {
        try {
            this.aDouble = Double.parseDouble(aDouble);//преобразовываем пролученный String aDouble в Doubl
        } catch (NumberFormatException e) {//строка не может быть преобразована в Double
            System.out.println("строку   " + aDouble + "   не возможно пребразить в Double");
            aDouble = null;//если преобразование не удалось,то мы присваиваем aDouble null
        }
    }
    public void setB_Multiply(String bDouble) {
        try {
            this.bDouble = Double.parseDouble(bDouble);//преобразовываем пролученный String bDouble в Doubl
        } catch (NumberFormatException e) {//строка не может быть преобразована в Double
            System.out.println("строку   " + bDouble + "   не возможно пребразить в Double");
            bDouble = null;//если преобразование не удалось,то мы присваиваем bDouble null
        }
    }
}
