package entity;

import java.time.LocalDate;
// StartMain и App внизу отдельные классы  тоже относятся к package entity


public abstract class Goods implements Comparable<Goods>{
    //свойства класса
    private String type;//тип
    private String name;//наименование'
    private Float price;//цена
    private LocalDate data;
    private Float number = 0f;//кол-во товара в самом начале = 0


    public Goods(String type, String name, Float price, LocalDate date, Float number){
        this(type,name,price,date);
        this.number = number;
    }

    public Goods(String type, String name, Float price, LocalDate date) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.data = date;
    }
    public Goods(){

    }
    //метод выводит словесное описание нашего товара
    //concat-это метд соединения вместо +
    @Override//обозначает перекрыть
    public String toString() {
        return type.concat(" : ").concat(name).concat(" : ").concat(price.toString()
                .concat(" : ").concat(data.toString()));
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public LocalDate getData() {
        return data;
    }

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
