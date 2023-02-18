package entity;

import java.time.LocalDate;

public class Food extends Goods{
    public Food(String name,Float price, LocalDate date) {
        setType("Food");//тип установили прямо в конструкторе
        setName(name);
        setPrice(price);
        setData(date);

    }

    @Override
    public int compareTo(Goods another) {
        //сортирую всю еду по названию (сравниваю поле name)

        //       return getName().compareTo(another.getName());

        //return getName()-текущий обЪект.compareTo-сравни(another-со следующим.getName()-обЪектом)
        //
        // метод compareTo  всегда ВОЗВРАЩАЕТ int-ы 0 или 1 или -1,даже если сравниваем String-и
        // 0 ==
        // 1 >
        // -1 <

        //сортировка по всем полям которые входят в toString
        //       return toString().compareTo(another.toString());
        // получили После сортировки
//        Food Йогурт 1.0
//        Food Йогурт 2.0
//        Food Манго 4.5
//        LG Phone РH1000 1000.0

        return getName().compareTo(another.getName()) & getData().compareTo(another.getData());

    }
}
