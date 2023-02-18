package entity;

import java.time.LocalDate;
import java.util.Objects;
// StartMain и App внизу отдельные классы  тоже относятся к package entity


public abstract class Goods implements Comparable<Goods>{
    //свойства класса
    private String type;//тип
    private String name;//наименование'
    private Float price;//цена
    private LocalDate data;
    private Float quantity = 0f;//кол-во товара в самом начале = 0


    public Goods(String type, String name, Float price, LocalDate date, Float counter){
        this(type,name,price,date);
        this.quantity = counter;
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
    //concat-это метод соединения вместо +
    @Override//обозначает перекрыть
    public String toString() {
        return type.concat(" : ").concat(name).concat(" : ").concat(price.toString()
                .concat(" : ").concat(data.toString())  + " : " + getCounter().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods)) return false;
        Goods goods = (Goods) o;
        return Objects.equals(getType(), goods.getType()) && Objects.equals(getName(), goods.getName()) && Objects.equals(getPrice(),
                goods.getPrice()) && Objects.equals(getData(), goods.getData()) && Objects.equals(getCounter(), goods.getCounter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getName(), getPrice(), getData(), getCounter());
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

    public Float getCounter() {
        return quantity;
    }

    public void setCounter(Float counter) {
        this.quantity = counter;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
