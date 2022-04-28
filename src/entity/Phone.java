package entity;

import java.time.LocalDate;

public class Phone extends Goods {
    //добавили еще одно поле manufacturer к тому что уже есть в Goods
    String manufacturer;//производитель//

    public Phone(String name, Float price, String manufacturer, LocalDate date) {//конструктор
        //super-вызывает конструктор родителя public Goods(String type, String name, Float price)
        super("Phone", name, price, date);
        this.manufacturer = manufacturer;//this.manufacturer возьми из параметра manufacturer
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public int compareTo(Goods another) {
        return getName().compareTo(another.getName());
    }

    @Override//перекрываем toString из класса Goods для нашего класса Phone
    //1)т.е написали свой метод взамен родительского
    //2)и мы по прежнему можем использовать метод родителя
    public String toString() {
        String partner = super.toString();//вызываем метод родителя
        return manufacturer.concat(" ").concat(partner); //return manufacturer + " " + partner;
    }
}



