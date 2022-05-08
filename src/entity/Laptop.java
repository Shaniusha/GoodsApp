package entity;

import java.time.LocalDate;

public class Laptop extends Goods{//class Laptop наследуется от класса Goods,кот-ый реализует интерфейс Comparable
    private String model;         //значит нужно написать метод compareTo
    private Integer year;

    public Laptop(String model, Integer year, String name, Float price, LocalDate date) {
        super("Laptop",name,price,date);
        this.model = model;
        this.year = year;

    }
    public Integer getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    //передаем обЪект и сравниваем его с текущим

    public int compareTo(Goods another) {
        try {
            Laptop o = (Laptop) another;
            if (year == o.getYear()) {
                return 0; // это равно
            }
            if (year < o.getYear()) {
                return -1; // это если меньше   //можно поменять на 1
            }
            return 1; //это если больше //можно поменять на -1
        }
        catch (Exception e){
            return -1;
        }

        //так можно записать,это одно и то же
        //      return this.year - o.year;
    }

    @Override
    public String toString() {
        return  "model: " + model + " , " +
                "year: " + year;

    }
}
