package Comparator_27_4_22;

//К КЛАССУ Car применяем (implements) интерфейс Comparable,able-имеет какую-то способность,а именно
//умеет сравнивать обЪект  реализуя метод compareTo

public class Car implements Comparable<Object> {
    private String model;
    private int Year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        Year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return Year;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Object o) {
//        this.getYear();//наше поле
//        //приводим Object o  к классу Car-((Car)o) и теперь можем вызвать у него метод  getYear()
//       ((Car)o).getYear();

        // return this.getYear() - ((Car) o).getYear(); // весь if else который ниже можно записать ТАК
        //сравниваем по годам

        if (this.getYear() == ((Car) o).getYear()) {
            return 0;
        } else if (this.getYear() > ((Car) o).getYear()) {
            return 1;
        } else
            return -1;
    }
}

